package Entites.Personnages;

import Entites.Entite;
import utils.De;
import deroulement.*;
import utils.Utils;

import java.util.Scanner;

import static utils.Utils.dico2;

public abstract class Personnage extends Entite {
    private String m_nom;
    private int m_pv;
    private int m_pvMax;
    private int m_force;
    private int m_dexterite;
    private int m_vitesse;
    private int m_initiative;

    public Personnage(String nom, int pv, int x, int y)
    {
        super(x,y);
        De de = new De(4,4);
        m_nom = nom;
        m_pv = pv;
        m_pvMax = pv;
        m_force = de.lanceDe()+3;
        m_dexterite = de.lanceDe()+3;
        m_vitesse = de.lanceDe()+3;
        m_initiative = de.lanceDe()+3;
    }

    @Override
    public void setPosition(int x, int y) {
        super.setPosition(x, y);
    }

    public void SeDeplacer(Donjon donjon) {
        int maxX = donjon.getM_longueur();
        int maxY = donjon.getM_largeur();
        int[] tabCoord = saisirPositionValide(maxX, maxY);
        int x = tabCoord[0];
        int y = tabCoord[1];
        // Vérification que la case n'est pas occupée, sinon demander une nouvelle position
        while (caseOccupee(y, x, donjon)) {
            System.out.println("La case est déjà occupée. Veuillez choisir une autre position.");
            tabCoord = saisirPositionValide(maxX, maxY);  // Demander une nouvelle position
            x = tabCoord[0];
            y = tabCoord[1];
        }
        // Une fois la position valide et libre, on affecte la nouvelle position
        setPosition(y, x);
        commenterDeplacement(y,x);
    }

    public void commenterDeplacement(int x, int y) {
        System.out.println(m_nom + " se place sur la case " + dico2.get(y)+(x+1));
    }

    public int[] saisirPositionValide(int maxX, int maxY) {
        Scanner scanner = new Scanner(System.in);
        int x = -1;
        int y = -1;
        boolean valide = false;

        while (!valide) {
            System.out.print("Donner la position à laquelle vous voulez vous déplacer (exemple : A2 ou E16) : ");
            String pos = scanner.nextLine().trim();

            if (pos.length() < 2 ) {
                System.out.println("Entrée invalide. Utilisez le format 'lettre' + 'chiffre' (ex: B4, J12, ...).");
                continue;
            }

            char lettre = pos.charAt(0);
            String chiffreStr = pos.substring(1);  // Gère aussi les positions comme A10

            if (!Utils.dico.containsKey(lettre)) {
                System.out.println("Lettre invalide. Elle ne correspond à aucune colonne de la grille.");
                continue;
            }

            x = Utils.dico.get(lettre);
            if (x < 0 || x > maxX) {
                System.out.println("Lettre invalide. Elle est en dehors des limites de la grille.");
                continue;
            }

            try {
                y = Integer.parseInt(chiffreStr) - 1;  // Convertit "2" → 1, "10" → 9, etc.
            } catch (NumberFormatException e) {
                System.out.println("Chiffre invalide. Ce n'est pas un nombre.");
                continue;
            }

            if (y < 0 || y > maxY) {
                System.out.println("Chiffre invalide. Il est en dehors des limites de la grille.");
                continue;
            }

            int distance = Math.abs(getM_x() - y) + Math.abs(getM_y() - x);
            if (distance > m_vitesse/3) {
                System.out.println("Position trop éloignée. Votre vitesse ne vous permet pas d'y aller.");
                continue;
            }

            // Tous les tests sont passés
            valide = true;
        }

        return new int[] { x, y };
    }

    public void ramasser(Donjon donjon) {
        // Par défaut : rien
        System.out.println("Action non valide.");
    }

    public void equiperChoix() {
        // Par défaut : rien
        System.out.println("Action non valide.");
    }

    public abstract void attaquer(Donjon donjon);

    public int getM_dexterite() {
        return m_dexterite;
    }

    public int getM_force() {
        return m_force;
    }

    public int getM_pv() {
        return m_pv;
    }

    public int getM_pvMax() { return m_pvMax; }

    public int getM_vitesse() { return m_vitesse;}

    public String getM_nom() { return m_nom;}

    public int getM_initiative() { return m_initiative;}

    public void setM_dexterite(int dexterite) {this.m_dexterite = dexterite;}

    public void setM_force(int force) {this.m_force = force;}

    public void setM_vitesse(int vitesse) {this.m_vitesse = vitesse;}

    public void setM_pv(int pv){this.m_pv = pv;}

    public abstract  String afficheApresTour();
    public abstract void actionAffichage(int actionsRestantes);
    public abstract void executerTour(Donjon donjon);
    public abstract String afficheTourInformation();
    public abstract void retirerDuDonjon(Donjon donjon);
    public abstract String toString();
}

package utils;

import Entites.Equipements.Arme;
import Entites.Personnages.Joueurs.Joueur;
import Entites.Personnages.Monstres.Monstre;
import deroulement.Donjon;

import java.util.Scanner;

public class Affichage {
    private final Scanner scanner;

    public Affichage() {
        this.scanner = new Scanner(System.in); // ✅ initialise bien le champ
    }

    public static void afficheBonusAttaque(int degatsArmure)
    {
        System.out.println("On ajoute votre bonus de dégats (+" + degatsArmure + ")");
    }

    public static void afficheFullVie(String nom)
    {
        System.out.println("Le joueur " + nom + " ne peut pas se faire guérir car il possède déjà 100% de ses pv");
    }

    public static void afficheGuerison(String nom, int heal){
        System.out.println("Le joueur " + nom + " se fait guerir de " + heal + " pv");
    }
    public static int afficherToutJoueurs(Donjon donjon)
    {
        int i = 0;
        for (Joueur j : donjon.getM_joueurOnGround()) {
            i++;
            System.out.println(i + ") " + j.afficheTourInformation());
        }
        return i;
    }

    public int afficheDemande(int len, String entite) {
        int choix = -1;

        System.out.println("Veuillez choisir le numéro " + entite + " sur lequel vous voulez effectuer l'action (entre 1 et " + len + ") :");

        while (choix < 1 || choix > len) {
            String input = scanner.nextLine();

            try {
                choix = Integer.parseInt(input);
                if (choix < 1 || choix > len) {
                    System.out.println("Numéro invalide. Veuillez entrer un nombre entre 1 et " + len + " :");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre valide :");
            }
        }

        return choix;
    }

    public static int afficherToutMonstres(int index, Donjon donjon)
    {
        int i = index;
        for (Monstre m : donjon.getM_monstreOnGround()) {
            i++;
            System.out.println(i + ") " + m.afficheTourInformation());
        }
        return i;
    }

    public static int afficherToutArmes(Joueur joueur){
        int i = 0;
        for (Arme a : joueur.getM_classe().getM_armes()) {
            i++;
            System.out.println(i + ") " + a);
        }
        return i;
    }

    public static void affichageAmeliorationArme(String nom)
    {
        System.out.println("Vous avez amélioré votre " + nom + "!");
    }

    public static void afficherSort(String nom)
    {
        System.out.println("Vous lancez " + nom);
    }

    public String demandeSort() {
        System.out.println("Indiquez le numero du sort que vous souhaitez lancer : \n 1) Guérison    2) Boogie Woogie    3) Arme magique");
        String numSort = scanner.nextLine().trim();

        while (!numSort.equals("1") && !numSort.equals("2") && !numSort.equals("3")) {
            System.out.println("Veuillez entrer un nombre valide : 1, 2 ou 3.");
            numSort = scanner.nextLine().trim();
        }

        // Ici on est sûr que numSort est "1", "2", ou "3"
        return numSort;
    }


}
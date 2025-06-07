package Entites;

import Entites.Personnages.Joueurs.Joueur;
import Entites.Personnages.Monstres.Monstre;
import deroulement.Donjon;

import java.util.ArrayList;
import java.util.List;

public abstract class Entite {

    private int m_x;
    private int m_y;

    public Entite(int x, int y) {
        this.m_x = x;
        this.m_y = y;
    }

    public int getM_x() {
        return m_x;
    }

    public int getM_y() {
        return m_y;
    }

    public void setPosition(int x, int y) {
        this.m_x = x;
        this.m_y = y;
    }
    public String getDisplaySymbol() {
        return " * "; // default symbol
    }

    public static boolean caseOccupee(int x, int y, Donjon donjon) {
        for (Monstre m : donjon.getM_monstreOnGround()) {
            if (m.getM_x() == x && m.getM_y() == y) {
                return true;
            }
        }
        for (Joueur j : donjon.getM_joueurOnGround()) {
            if (j.getM_x() == x && j.getM_y() == y) {
                return true;
            }
        }
        for (Obstacle o : donjon.getM_obstacleOnGround()) {
            if (o.getM_x() == x && o.getM_y() == y) {
                return true;
            }
        }
        return false;
    }
    public void ramasser(Joueur joueur) {
        // Par défaut : ne fait rien
    }
}
package Model;
import java.util.Random;

/** terrain des cellules de la simulation de fourmis */

public class Terrain {

    /** grille a l'instant t*/
    public Cellule [][] grille;
    /** taille de la grille*/
    private int taille;
    /** nombre de fourmis */
    private int nbFourmis = 50;
    /**coordonnee x du nid*/
    private int xNid;
    /**coordonnee y du nid*/
    private int yNid;

    public Terrain(int taille, int nbFourmis, int xNid, int yNid) {
        this.taille = taille;
        this.nbFourmis = nbFourmis;
        this.xNid = xNid;
        this.yNid = yNid;
    }

    public int getTaille() {
        return taille;
    }

    public int getNbFourmis() {
        return nbFourmis;
    }

    public int getxNid() {
        return xNid;
    }

    public int getyNid() {
        return yNid;
    }
}


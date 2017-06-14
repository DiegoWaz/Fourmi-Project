package Model;
import java.util.Random;

public class Terrain {

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

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public int getNbFourmis() {
        return nbFourmis;
    }

    public void setNbFourmis(int nbFourmis) {
        this.nbFourmis = nbFourmis;
    }

    public int getxNid() {
        return xNid;
    }

    public void setxNid(int xNid) {
        this.xNid = xNid;
    }

    public int getyNid() {
        return yNid;
    }

    public void setyNid(int yNid) {
        this.yNid = yNid;
    }
}


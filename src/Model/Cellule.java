package Model;

/**
 * cette classe représente une cellule de la simulation de fourmis
 */

public class Cellule {
    /**coordonnee de la cellule dans la grille*/
    private int x,y;
    /**pheromones*/
    private double pheromone;
    /**nourriture*/
    private double nourriture;
    /**cellule d'un nid*/
    private boolean nid;
    /**presence d'au moins une fourmis*/
    private boolean fourmis;

    /** reference a la grille des cellule*/
    Cellule [][]grille;

    /**a change recemment*/
    boolean hasJustChanged;

    /** constructeur par defaut, inutilise*/
    public Cellule(){}

    public Cellule(int x, int y, double pheromone, double nourriture, boolean nid, boolean fourmis) {
        this.x = x;
        this.y = y;
        this.pheromone = pheromone;
        this.nourriture = nourriture;
        this.nid = nid;
        this.fourmis = fourmis;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getPheromone() {
        return pheromone;
    }

    public void setPheromone(double pheromone) {
        this.pheromone = pheromone;
    }

    public double getNourriture() {
        return nourriture;
    }

    public void setNourriture(double nourriture) {
        this.nourriture = nourriture;
    }

    public boolean isNid() {
        return nid;
    }

    public void setNid(boolean nid) {
        this.nid = nid;
    }

    public boolean isFourmis() {
        return fourmis;
    }

    public void setFourmis(boolean fourmis) {
        this.fourmis = fourmis;
    }
}

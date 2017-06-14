package Model;
import java.util.Random;

/** classe représentant une fourmi évoluant à la recherche de nourriture à l'aide de phéromones*/

public class Fourmi {

    /** coordonnée X de la fourmi*/
    private int x;
    /** coordonnée y de la fourmi*/
    private int y;
    /** direction  de la fourmi*/
    private Direction direction;

    public Fourmi(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

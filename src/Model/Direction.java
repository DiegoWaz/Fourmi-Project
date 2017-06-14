package Model;
import java.util.Random;

/**type enumere evolue codant les 8 directions sous forme de vecteur */

public enum Direction {
    N(0, 0, -1),
    NE(1, 1, -1),
    E(2,1,0),
    SE(3,1,1),
    S(4,0,1),
    SO(5,-1,1),
    O(6,-1,0),
    NO(7,-1,-1);

    /* no d'indice de la direction */
    public int no;
    /* coordonnée x du vecteur de la direction */
    public int x;
    /* coordonnée y du vecteur de la direction */
    public int y;

    Direction(int no, int x, int y) {
        this.no = no;
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

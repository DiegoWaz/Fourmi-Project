
import java.awt.Color;


public class Fourmi {
    
    private int x;
    private int y;
    Color color;
    int taille = 10;
    
    public Fourmi (int x , int y , Color c) {
        
        this.x = x;
        this.y = y;
        this.color = c;
       
    }
    
    public int getTaille () {
        return this.taille;  
    }
    
    public int getX () {
        return this.x;  
    }
    
    public int getY () {
        return this.y;  
    }
    
    public Color getColor () {
       return this.color;  
    }
    
    public void setX (int x) {
        this.x = x;  
    }
    
    public void setY (int y) {
        this.x = x;  
    }
    
    public void setColor (Color c) {
        this.color = c;  
    }
    
}

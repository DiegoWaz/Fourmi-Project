import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Panel extends JPanel {
    
    private int height = this.getSize().height;
    private int width = this.getSize().width;
    private int tailleCase = 20;
    
    private int terrain [][] = new int [24][25];
    
    private Fourmi fourmi = new Fourmi(0,0 , Color.red);
        
    public Panel () {
        
         System.out.println(this.width);
         System.out.println(height);
    }
    
    public void dessinerCarre (int x , int y ) {
        
        this.terrain[x][y] = 1;
    }
    
    private void move (){
    
       this.fourmi.setX(this.fourmi.getX()+1);
       this.fourmi.setY(this.fourmi.getY()+1);
       this.repaint();  
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    
    public void paintComponent(Graphics g){
   
         // Quadrillage
         
         int height = this.getSize().height;
         int width = this.getSize().width;
         
         System.out.println(this.getSize().height-22);
         System.out.println(this.getSize().width);
         
         for (int i = 1 ; i < height/this.tailleCase ; i++) g.drawLine(0, i*this.tailleCase, width, i*this.tailleCase); 
         for (int j = 1 ; j < width/this.tailleCase ; j ++) g.drawLine(j*this.tailleCase, 0, j*this.tailleCase, height);
         
         // Dessin de la fourmilliere au milieu
             
         dessinerCarre(terrain.length/2,terrain[terrain.length/2].length/2);
         dessinerCarre(terrain.length/2,terrain[terrain.length/2].length/2-1);
         dessinerCarre(terrain.length/2,terrain[terrain.length/2].length/2+1);
         dessinerCarre(terrain.length/2-1,terrain[terrain.length/2].length/2);
         dessinerCarre(terrain.length/2-1,terrain[terrain.length/2].length/2-1);
         dessinerCarre(terrain.length/2-1,terrain[terrain.length/2].length/2+1);
         dessinerCarre(terrain.length/2+1,terrain[terrain.length/2].length/2+1);
         dessinerCarre(terrain.length/2+1,terrain[terrain.length/2].length/2-1);
         dessinerCarre(terrain.length/2+1,terrain[terrain.length/2].length/2);
         
         
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
         
         
    
         for (int i = 0 ; i < terrain.length ; i ++) {
             
             for (int j = 0 ; j < terrain[i].length ; j ++){
                 
                 if (terrain[i][j] == 1) {
                     
                   g.setColor(Color.green);
                   g.fillRect(i*this.tailleCase, j*this.tailleCase, this.tailleCase, this.tailleCase);

                 }
             }
             
         }
         
         
         //g.fillRect(width/2-this.tailleCase/2, height/2-this.tailleCase/2, this.tailleCase, this.tailleCase);
         //g.fillRect(width/2-this.tailleCase*2, height/2-this.tailleCase/2, this.tailleCase, this.tailleCase);

                      
    }            
    
}

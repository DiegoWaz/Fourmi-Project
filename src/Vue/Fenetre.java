import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
    
    private int width = 500;
    private int height = 522;
   
    private JPanel panel = new Panel();
   
    public Fenetre(){
        
        this.setTitle("Fourmis");
        this.setSize(width, height);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        
        this.setContentPane(this.panel);    
        
        this.setVisible(true);
  }
    
}

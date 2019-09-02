//Supriya Maddineni
import javax.swing.*;
import java.awt.*;
public class HangmanDisplay extends JPanel
{
   private JLabel label1;
   private int[] bits;
   private JLabel[] output;
   public int mistakeCount=0;


   public HangmanDisplay(String word)
   {
      setLayout(new BorderLayout());
   
      
      
      
      label1 = new JLabel();
      label1.setFont(new Font("Serif", Font.BOLD, 20));
      label1.setForeground(Color.blue);
      add(label1);
      
      /*output = new JLabel[word.length()];
      bits = new int[word.length()];
      for(int x = 0; x <= output.length; x++)
      {
         output[x] = new JLabel(" - ");
         output[x].setFont(new Font("Serif", Font.BOLD, 50));
         add(output[x]);
      }
   
      //setBlank();
   
   }
   public void setBlank()
   {    
      for(int x = 0; x < bits.length; x++)
      {
         output[x].setText(" - ");
      }
   }*/
   }
   public void paintComponent(Graphics g)
   {
      super.paintComponent(g);
      if (mistakeCount==0) {  
         ImageIcon Gallows = new ImageIcon ("Gallows.jpg");
         g.drawImage (Gallows.getImage(), 150, 20, 200, 250, null);
      }
       
      if (mistakeCount==1) {
         System.out.println("Came here. Mistakecount=1");
      
         ImageIcon Head = new ImageIcon ("Head.jpg");        
         g.drawImage (Head.getImage(), 150, 20, 200, 250, null);
      }
      if (mistakeCount==2) {
         ImageIcon Torso = new ImageIcon ("Torso.jpg");        
         g.drawImage (Torso.getImage(), 150, 20, 200, 250, null);
      }
      if (mistakeCount==3) {
         ImageIcon Arm1 = new ImageIcon ("Arm1.jpg");        
         g.drawImage (Arm1.getImage(), 150, 20, 200, 250, null);
      }
      if (mistakeCount==4) {
         ImageIcon Arm2 = new ImageIcon ("Arm2.jpg");        
         g.drawImage (Arm2.getImage(), 150, 20, 200, 250, null);
      }
      if (mistakeCount==5) {
         ImageIcon Leg1 = new ImageIcon ("Leg1.jpg");        
         g.drawImage (Leg1.getImage(), 150, 20, 200, 250, null);
      }
      if (mistakeCount==6) {
         ImageIcon Leg2 = new ImageIcon ("Leg2.jpg");        
         g.drawImage (Leg2.getImage(), 150, 20, 200, 250, null);
      }
      if (mistakeCount==7) {
         ImageIcon Dead = new ImageIcon ("Dead.jpg");        
         g.drawImage (Dead.getImage(), 150, 20, 200, 250, null);
         label1.setText("YOU LOST!!! FAIL!!");
      }
       
       
      
   
              
   }


}
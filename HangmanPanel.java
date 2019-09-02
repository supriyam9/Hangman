    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
//
public class HangmanPanel extends JPanel
{
   private String myWord;
  
   //private Display11 labelDisplay;

   private HangmanDisplay display;
   private int count;
   Graphics g;
   private JLabel[] output;


   public HangmanPanel(String word)
   {
      myWord=word;
      setLayout(new BorderLayout());
      display = new HangmanDisplay(word);
      add(display, BorderLayout.CENTER);
   
     // labelDisplay = new Display11();
     // add(labelDisplay, BorderLayout.CENTER);
      JPanel subpanel = new JPanel();
      subpanel.setLayout(new GridLayout(1, word.length()));
   output = new JLabel[word.length()];
           
      for(int x = 0; x < word.length(); x++)
      {
      
         output[x] = new JLabel(" ", SwingConstants.CENTER);
         output[x].setFont(new Font("Serif", Font.BOLD, 50));
         subpanel.add(output[x]);
         add(subpanel, BorderLayout.NORTH);
         
      
         
      }
      for(int x = 0; x < word.length(); x++)
      {
         output[x].setText(" - ");
      }
   
   
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3,9,2,2));
      add(panel,BorderLayout.SOUTH);
      for(char k='a'; k<='z'; k++)
      {
         addButton(panel, ""+k);
      }
      System.out.println(word);
   } 
   private void addButton(JPanel panel, String s)
   {
      JButton button = new JButton(s);
      button.addActionListener(new Listener(s,button));
      panel.add(button);
           
   }
   private class Listener implements ActionListener
   {
      private String myLetter;
      private JButton button;
      public Listener(String s, JButton b)
      {
         myLetter = s;
         button = b;
      }
      public void actionPerformed(ActionEvent e)
      {
      
         button.setEnabled(false);
         System.out.println("letter: " + myLetter);
         //int num = compareWord(myLetter);
         int[] matchedPos = compareWord(myLetter);         
         for(int k = 0; k< matchedPos.length; k++) {
            System.out.println("Matched chars are " + matchedPos[k]);
            if ( matchedPos[k]> 0) {
               //put the char in that position in display
               
            } 
            else {
               System.out.println("User pressed wrong key. Mistake count before change=" +  display.mistakeCount);
            
               //user pressed wrong key..set the mistakeCount to next value
               display.mistakeCount=display.mistakeCount + 1;
               System.out.println("Mistake count after change=" +  display.mistakeCount);
            
               //now that the mistakeCount is changed, redraw again
               display.repaint();    
            }
            break;
         }
      
         //if (num==10)
        // count++;
         //System.out.println("Correct letter position: " + (num));
         
      }
   }  
   public int[] compareWord(String letter)
   {
      int check=0;
      char c = letter.charAt(0);
      System.out.println("Entered letter is " + letter);
      System.out.println("Entered char is " + c);
      int[] matchedVal = new int[myWord.length()];
   
      int i=0;
      
      char[] A;
      A = myWord.toCharArray( );
           
      for(int k = 0; k< myWord.length(); k++) {
         System.out.println("value in A for "+ k + "is " + A[k]);
         System.out.println("c value: " + c);
      
         if(c==A[k]) {
            System.out.println("match found!!");
            matchedVal[i]=k+1;
            i=i+1;
            //check = k;
            //return check;
         } 
         /*else {
            System.out.println("wrong letter!!");
         }*/
      }
      
      return matchedVal;
     
   }


  
}
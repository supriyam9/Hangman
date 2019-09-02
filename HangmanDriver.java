//Supriya Maddineni and Natasha Narayanan

import javax.swing.JFrame;
import java.io.*;
import javax.swing.JOptionPane;

public class HangmanDriver
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("HANGMAN!!!");
      frame.setSize(500, 500);
      frame.setLocation(200, 100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      String word = JOptionPane.showInputDialog("Player 1, Enter your word:");
      JOptionPane.showMessageDialog(null, word.toString());
      frame.setContentPane(new HangmanPanel(word));
      frame.setVisible(true);
      
   }
}
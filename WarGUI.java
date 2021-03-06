/**
   Azulena Royer
   CS 110
   Assignment 10: War GUI
   The GUI for the game
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;  

public class WarGUI extends JFrame
{
   /**
      Declare fields
   */
   
   War w = new War(); // To hold a War object
   private ImageIcon back, card1, card2; // The jpg of the back side of a card
   private JButton quit, go; // The buttons
   private JPanel f1, f2, f3, f4, f5, f6, f7, f8, f9; // The frames 
   private JLabel front1, front2; // The jpgs of the front sides of the two cards 
   
   /**
      A no arg constructor that creates the desired frame for the game War
   */
   
   public WarGUI()
   {
      // Set the title
      setTitle("War");
      
      // Set the layout
      setLayout(new GridLayout(3,3));
      
      // The picture of the back of a card
      back = new ImageIcon("back.jpg");
      
      // Create a label for player 1
      JLabel h1 = new JLabel("Player 1");
      f1 = new JPanel();
      f1.add(h1); // Add label
      f2 = new JPanel();
      f2.setBackground(Color.GRAY);
      f2.add(new JLabel(back)); // Display the back of the card 
      front1 = new JLabel();
      f3 = new JPanel();
      f3.setBackground(Color.GRAY);
      f3.add(front1); // Display the front of the first player's card
      
      // Create a label for player 2
      JLabel h2 = new JLabel("Player 2");
      f4 = new JPanel();
      f4.add(h2); // Add label
      f5 = new JPanel();
      f5.setBackground(Color.GRAY);
      f5.add(new JLabel(back)); // Display the back of the card
      front2 = new JLabel();
      f6 = new JPanel();
      f6.setBackground(Color.GRAY);
      f6.add(front2); // Display the front of the second player's card
      
      // Quit button
      JButton quit = new JButton("Quit");   
      quit.addActionListener(new QuitListener());
      f7 = new JPanel();
      f7.add(quit);
      
      // Empty panel
      f8 = new JPanel();
      
      // Continue button
      go = new JButton("Go");
      go.addActionListener(new GoListener());
      f9 = new JPanel();
      f9.add(go);
      
      // Add frames
      add(f1);
		add(f2);
		add(f3);
		add(f4);
		add(f5);
		add(f6);
      add(f7);
      add(f8);
      add(f9);
   } 
   
   /**
      The QuitListener class exits the program
   */
   
   public class QuitListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e) 
      {
         System.exit(0);
      } 
   }
   
   /**
      The GoListener class prompts the next move in the game
   */
   
   public class GoListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e) 
      {
         // If the game is not over
         if(!w.getStatus())
			{
            // Get the jpgs of the two cards
				card1 = w.getH1().look().getPicture();
				card2 = w.getH2().look().getPicture();
				front1.setIcon(card1);
            front2.setIcon(card2);            
				w.go();
			}
      }    
   }
   
}

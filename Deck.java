/**
   Azulena Royer
   CS 110
   Assignment 10: Deck Class
   The Deck class creates a deck of cards with images. 
*/

import java.io.*;
import java.util.Random; 
import javax.swing.*;
import java.util.LinkedList;
import java.awt.*;
import java.util.Scanner;

public class Deck extends Hand
{
   /**
	   This no arg constructor creates a Deck object containing the 52 cards.	
   */
   
	public Deck()
	{
		super();
		makeDeck();
	}

	/**
	   makeDeck method puts the 52 cards to the deck
	*/
   
	public void makeDeck()
	{
		// Make the spades
		super.add(new Card(1, 2, new ImageIcon("2s.jpg")));
		super.add(new Card(1, 3, new ImageIcon("3s.jpg")));
		super.add(new Card(1, 4, new ImageIcon("4s.jpg")));
		super.add(new Card(1, 5, new ImageIcon("5s.jpg")));
		super.add(new Card(1, 6, new ImageIcon("6s.jpg")));
		super.add(new Card(1, 7, new ImageIcon("7s.jpg")));
		super.add(new Card(1, 8, new ImageIcon("8s.jpg")));
		super.add(new Card(1, 9, new ImageIcon("9s.jpg")));
		super.add(new Card(1, 10, new ImageIcon("10s.jpg")));
		super.add(new Card(1, 11, new ImageIcon("jacks.jpg")));
		super.add(new Card(1, 12, new ImageIcon("queens.jpg")));
		super.add(new Card(1, 13, new ImageIcon("kings.jpg")));
		super.add(new Card(1, 1, new ImageIcon("aces.jpg")));

		// Make the clubs
		super.add(new Card(2, 2, new ImageIcon("2c.jpg")));
		super.add(new Card(2, 3, new ImageIcon("3c.jpg")));
		super.add(new Card(2, 4, new ImageIcon("4c.jpg")));
		super.add(new Card(2, 5, new ImageIcon("5c.jpg")));
		super.add(new Card(2, 6, new ImageIcon("6c.jpg")));
		super.add(new Card(2, 7, new ImageIcon("7c.jpg")));
		super.add(new Card(2, 8, new ImageIcon("8c.jpg")));
		super.add(new Card(2, 9, new ImageIcon("9c.jpg")));
		super.add(new Card(2, 10, new ImageIcon("10c.jpg")));
		super.add(new Card(2, 11, new ImageIcon("jackc.jpg")));
		super.add(new Card(2, 12, new ImageIcon("queenc.jpg")));
		super.add(new Card(2, 13, new ImageIcon("kingc.jpg")));
		super.add(new Card(2, 1, new ImageIcon("acec.jpg")));

		// Make the hearts
		super.add(new Card(3, 2, new ImageIcon("2h.jpg")));
		super.add(new Card(3, 3, new ImageIcon("3h.jpg")));
		super.add(new Card(3, 4, new ImageIcon("4h.jpg")));
		super.add(new Card(3, 5, new ImageIcon("5h.jpg")));
		super.add(new Card(3, 6, new ImageIcon("6h.jpg")));
		super.add(new Card(3, 7, new ImageIcon("7h.jpg")));
		super.add(new Card(3, 8, new ImageIcon("8h.jpg")));
		super.add(new Card(3, 9, new ImageIcon("9h.jpg")));
		super.add(new Card(3, 10, new ImageIcon("10h.jpg")));
		super.add(new Card(3, 11, new ImageIcon("jackh.jpg")));
		super.add(new Card(3, 12, new ImageIcon("queenh.jpg")));
		super.add(new Card(3, 13, new ImageIcon("kingh.jpg")));
		super.add(new Card(3, 1, new ImageIcon("aceh.jpg")));

		// Make the diamonds
		super.add(new Card(4, 2, new ImageIcon("2d.jpg")));
		super.add(new Card(4, 3, new ImageIcon("3d.jpg")));
		super.add(new Card(4, 4, new ImageIcon("4d.jpg")));
		super.add(new Card(4, 5, new ImageIcon("5d.jpg")));
		super.add(new Card(4, 6, new ImageIcon("6d.jpg")));
		super.add(new Card(4, 7, new ImageIcon("7d.jpg")));
		super.add(new Card(4, 8, new ImageIcon("8d.jpg")));
		super.add(new Card(4, 9, new ImageIcon("9d.jpg")));
		super.add(new Card(4, 10, new ImageIcon("10d.jpg")));
		super.add(new Card(4, 11, new ImageIcon("jackd.jpg")));
		super.add(new Card(4, 12, new ImageIcon("queend.jpg")));
		super.add(new Card(4, 13, new ImageIcon("kingd.jpg")));
		super.add(new Card(4, 1, new ImageIcon("aced.jpg")));
	}
}
/**
   Azulena Royer
   CS 110
   Assignment 10: Hand class
   The Hand class allows the user to make an object that is able to hold a list of Card objects. 
*/

import java.util.LinkedList;
import java.io.*;
import java.util.Random;

public class Hand 
{
   /**
      Declare fields
   */

   int n; // The number of cards
   private LinkedList<Card> list; // To hold the list of cards

	/**
	   This no arg constructor creates an empty list of Card objects
	*/
   
	public Hand()
	{
      // Create an empty LinkedList object
		list = new LinkedList<Card>();
	}
   
   /**
	   The dealCard method randomly chooses a Card object
	   @return A Card object
	*/
   
	public Card dealCard()
	{
		// Make a Random object
      Random r = new Random();
      
      // Pick a card 
		Card c = list.get(r.nextInt(list.size()));
      
      // Remove the card from the list	
		list.remove(c);
      
      // Update counter
		n--;
      
      // Return the Card object
		return c;
	}
   
   /**
	   The draw method returns the first Card object in the list
	   @return The first card in the list
	*/
   
	public Card draw()
	{
		// Update counter
      n--;
      
      // Return the first Card object in the list
		return list.removeFirst();
	}
   
   /**
	   The add method adds a Card object to the list
	   @param c Card object
	*/
   
	public void add(Card c)
	{
      // Add the Card object to the list
		list.add(c);
      
      // Update counter
		n++;
	}

	/**
		The look method returns the Card object which is on the top of the list, but
      does not actually remove the Card object from the list
		@return The Card object which is on the top of the list
	*/
   
	public Card look()
	{
      // Return the first Card object in the list 
		return list.get(0);
	}

   /**
	   The cardsRemaining method returns the number of Card objects left in the list
	   @return The number of Card objects in the list
	*/
	public int cardsRemaining()
	{
		// Return the number of Card objects remaining in the list
      return n;
	}
      
	/**
	   The isEmpty method determines whether or not the list is empty
	   @return True/False
	*/
   
	public boolean isEmpty()
	{
		// Check to see if the list is empty 
      if(n == 0)
         // If it is empty, return true
			return true;
      // If it is not empty, return false   
		else return false;
	}
}
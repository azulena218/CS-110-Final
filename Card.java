/**
   Azulena Royer
   CS 110
   Assignment 10: Card class
   The Card class creates an object that holds suit, rank, and ImageIcon
*/

import javax.swing.*;

public class Card
{
   /**
      Declare fields
   */
   
	public final static int SPADES = 1;
	public final static int CLUBS = 2;
	public final static int HEARTS = 3;
	public final static int DIAMONDS = 4;
	public final static int ACE = 1;
	public final static int JACK = 11;
	public final static int QUEEN = 12;
	public final static int KING = 13;
   
   private int suit;	// To hold the card's suit
	private int rank;	// To hold the card's rank
	private ImageIcon picture; // To hold the card's image 
   
   /**
      A constructor that accepts the suit, rank and .jpg file.
      @param s The suit of the card.
      @param r the rank of the card.
      @param p The jpg of the card.
    */
    
	public Card(int s, int r, ImageIcon p)
	{
		suit = s; // Set suit
		rank = r; // Set rank
		picture = p; // Set picture
	}
   
   /**
      The getSuit method allows the user to get the suit of the card
      @return The suit of the card  
   */
   
   public int getSuit()
   {
      return suit; // Return suit
   }
   
   /**
      The getRank method allows the user to get the rank of the card
      @return The rank of the card  
   */
   
   public int getRank()
   {
      return rank; // Return rank
   }

	/**
      The getPicture method returns the jpg of the card.
      @return The picture of the card.
	*/
   
	public ImageIcon getPicture()
  	{
    	return picture; // Return picture
  	}

   /**
      The compare method determines which card has a higher rank or if the two cards are equal.
      @return 1,-1, or 0.
	*/
   
	public int compare(Card c)
	{
      // Compare the ranks of the two Card objects and return the appropriate value. 
		if(this.getRank() > c.getRank())
			return 1;
		else if(this.getRank() < c.getRank())
			return -1;
		else
			return 0;
	}
   
}
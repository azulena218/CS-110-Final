/**
   Azulena Royer
   CS 110
   Assignment 10: War class
*/

public class War
{
   /**
      Declare fields
   */

   Deck d; // Create a deck
   Hand h1; // The player 1's hand
   Hand h2; // The player 2's hand
   boolean status; // Whether or not the game is finished 

   /**
	   This no arg constructor makes a complete deck and then deals the cards to the two players' hands
	*/
   
   public War()
   {
      status = false;
      d = new Deck(); // Make a complete deck
      h1 = new Hand(); // Create player 1's hand
      h2 = new Hand(); // Create player 2's hand
      
      // Deal cards
      while (!d.isEmpty())
      {
         h1.add(d.dealCard());
			h2.add(d.dealCard());
      } 
   }
   
   /**
      The go method simulates one round of play
   */
   
    public void go()
    {
      // Draw one card from each of the players' hands
      Card c1 = h1.draw();
      Card c2 = h2.draw();
      
      int result1; // To hold the returned valued from the compare method
      
      // Compare the two cards
      result1 = c1.compare(c2); 
      
      // If c1 beats c2
      if (result1 == 1)
      {
         // Add both cards to player 1's hand
         h1.add(c1);
			h1.add(c2);
         System.out.println("Player 1 wins this round.");
      }
      
      // If c2 beats c1
      else if (result1 == -1)
      {
         // Add both cards to player 2's hand
         h2.add(c1);
			h2.add(c2);
         System.out.println("Player 2 wins this round.");
      }
      
      // If the cards have the same rank (if a war occurs)
      else
      {
         do
         {
            System.out.println("War!");
            
            // Draw one card from each player face down
            Card down1 = h1.draw();
   		   Card down2 = h2.draw(); 
            
            // Draw one card from each player face up
            Card up1 = h1.draw();
            Card up2 = h2.draw();
            
            // Determine which card is higher 
            result1 = up1.compare(up2); 
            
            // If c1 beats c2
            if (result1 == 1)
            {
               // Add the six cards to player 1's hand
               h1.add(c1);
      			h1.add(c2);
               h1.add(down1);
               h1.add(down2);
               h1.add(up1);
               h1.add(up2);
               System.out.println("Player 1 wins this war.");
            }
            
            // If c2 beats c1
            else if (result1 == -1)
            {
               // Add the six cards to player 2's hand
               h2.add(c1);
      			h2.add(c2);
               h2.add(down1);
               h2.add(down2);
               h2.add(up1);
               h2.add(up2);
               System.out.println("Player 2 wins this war.");
            }
         } while (result1 == 0);
      } 
    }
   
   /**
	   The getStatus method returns the status field
	   @return True/False
	*/
   
	public boolean getStatus()
	{
		return status;
	}
   
   /**
	   The getH1 method returns h1
	   @return Player 1's Hand
	*/
   
	public Hand getH1()
	{
		return h1;
	}

	/**
	   The getH1 method returns h2
	   @return Player 2's Hand
	*/
   
	public Hand getH2()
	{
		return h2;
	}
      
   
}
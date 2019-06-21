/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameplayer;

/**
 *
 * @author gian
 */
public class CardHand {
   private int handSize =52;
   public Card[] cards =new Card[handSize];
   public void generateHand()
        {
                int countCards = 0;
      
             	for(Card.Suit s: Card.Suit.values())
                {
                    for(Card.Value v: Card.Value.values())
                    {
                        //Creating objects using constructor and 
                        //assigning values of emun fields 
                        //from list of possible discrete values
                        cards[countCards] = (new Card(s,v));
                        countCards++;
                    }
                }//end outter for
        }//end method
}

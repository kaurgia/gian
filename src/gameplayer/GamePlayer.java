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
public class GamePlayer {

       public static void main(String[] args) {
        // TODO code application logic here
        CardHand chand=new CardHand();
        chand.generateHand();
        for(Card c: chand.cards)
        {
        System.out.println(c.getValue() + " of "+c.getSuit());
        }
        // System.out.println(ch.cards); show what happens when there is no toString()
 
    

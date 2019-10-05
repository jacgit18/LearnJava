package l07_JavaDoc_and_Unit_Tests;

import java.util.Random;

import l07_JavaDoc_and_Unit_Tests_P2.Card;
import l07_JavaDoc_and_Unit_Tests_P2.Suits;
import l07_JavaDoc_and_Unit_Tests_P2.Ranks;




public class PlayingCardsRun {
/*
 /**
 * 
 * @param args 
 */
    public void Blackcard() {
        Random gen = new Random();
        Card c1 = new Card(Ranks.ACE,Suits.HEARTS);
        Card c2 = new Card(gen.nextInt(52));
        
  
        
       
        System.out.printf("Cards: %s %s\n",c1.toString(),c2.toString());
        System.out.printf("SAME RANK : %s\n", c1.sameRank(c2));
        System.out.printf("SAME SUIT : %s\n", c1.sameSuit(c2));
        System.out.printf("SAME CARD : %s\n", c1.sameCard(c2));
    }
}

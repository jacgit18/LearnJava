package l04_Introducing_Objects_75_gobackfor_Activities;

import java.util.Random;

import l04_Introducing_Objects_P2.Card;
import l04_Introducing_Objects_P2.Ranks;
import l04_Introducing_Objects_P2.Suits;

public class PlayingWithCards {

	public void Cards() {
		
		 Random gen = new Random();
		    Card queenOfHearts = new Card(Ranks.QUEEN, Suits.HEARTS);
		    Card randomCard = new Card(gen.nextInt(52));
		    System.out.printf("%s %s Same Suit? %s\n", 
		    queenOfHearts, 
		    randomCard, 
		    randomCard.sameSuit(queenOfHearts));             

		
	}
	
	
}

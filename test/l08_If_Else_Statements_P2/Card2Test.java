package l08_If_Else_Statements_P2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import l08_If_Else_Statements_P2.Card2;
import l08_If_Else_Statements_P2.Ranks;
import l08_If_Else_Statements_P2.Suits;

class Card2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void testCard2Int() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testCard2IntInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRank() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSuit() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testIsRed() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testIsBlack() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testIsFace() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSameSuit() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSameRank() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSameCard() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSameColor() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRankDiff() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testLessThanBySuitThenRank() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testLessThanByRankThenSuit() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testToString() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testObject() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetClass() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testHashCode() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testEquals() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testClone() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testToString1() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testNotify() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testNotifyAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testWait() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testWaitLong() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testWaitLongInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testFinalize() {
//		fail("Not yet implemented");
//	}
	
	///////////////////////////////////////////////
	
	@Test
    public void LessThanBySuitThenRank_ExpectTrue_WhenClubsAndSpades() {
        //arrange
        Card2 instance = new Card2(Ranks.JACK, Suits.CLUBS);
        Card2 c = new Card2(Ranks.JACK,Suits.SPADES); 
        boolean expResult = true;
        //act - clubs less than spades
        boolean result = instance.lessThanBySuitThenRank(c); 
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanBySuitThenRank_ExpectFalse_WhenSpadesAndHearts() {
        //arrange
        Card2 instance = new Card2(Ranks.JACK, Suits.SPADES);
        Card2 c = new Card2(Ranks.JACK,Suits.HEARTS); 
        boolean expResult = false;
        //act - Spades not less than Hearts
        boolean result = instance.lessThanBySuitThenRank(c); 
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanBySuitThenRank_ExpectTrue_WhenThreeHeartsAndJackHearts() {
        //arrange
        Card2 instance = new Card2(Ranks.THREE, Suits.HEARTS);
        Card2 c = new Card2(Ranks.JACK,Suits.HEARTS); 
        boolean expResult = true;
        //act - both hearts, so 3 less than Jack
        boolean result = instance.lessThanBySuitThenRank(c); 
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void LessThanBySuitThenRank_ExpectFalse_WhenTenSpadesAndTwoSpades() {
        //arrange
        Card2 instance = new Card2(Ranks.TEN, Suits.SPADES);
        Card2 c = new Card2(Ranks.TWO,Suits.SPADES); 
        boolean expResult = false;
        //act - both spades, but ten not less than two
        boolean result = instance.lessThanBySuitThenRank(c); 
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanByRankThenSuit_ExpectTrue_WhenThreeAndKing() {
        //arrange
        Card2 instance = new Card2(Ranks.THREE, Suits.SPADES);
        Card2 c = new Card2(Ranks.KING,Suits.CLUBS);
        boolean expResult = true;
        //act - three less than king
        boolean result = instance.lessThanByRankThenSuit(c);
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanByRankThenSuit_ExpectFalse_WhenAceAndFive() {
        //arrange
        Card2 instance = new Card2(Ranks.ACE, Suits.SPADES);
        Card2 c = new Card2(Ranks.FIVE,Suits.HEARTS);
        boolean expResult = false;
        //act - ace not less than 5
        boolean result = instance.lessThanByRankThenSuit(c);
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanByRankThenSuit_ExpectTrue_WhenThreeClubsAndThreeHearts() {
        //arrange
        Card2 instance = new Card2(Ranks.THREE, Suits.CLUBS);
        Card2 c = new Card2(Ranks.THREE,Suits.HEARTS);
        boolean expResult = true;
        //act - name rank, so compare suit, clubs less than hearts
        boolean result = instance.lessThanByRankThenSuit(c);
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanByRankThenSuit_ExpectFalse_WhenKingSpadesAndKingDiamonds() {
        //arrange
        Card2 instance = new Card2(Ranks.KING, Suits.SPADES);
        Card2 c = new Card2(Ranks.KING,Suits.DIAMONDS);
        boolean expResult = false;
        //act - name rank, so compare suit, spades not less than diamonds
        boolean result = instance.lessThanByRankThenSuit(c);
        //assert
        assertEquals(expResult, result);
    }

}

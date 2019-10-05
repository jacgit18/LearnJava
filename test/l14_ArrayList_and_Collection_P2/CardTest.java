package l14_ArrayList_and_Collection_P2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import l14_ArrayList_and_Collection_P2.Card;
import l14_ArrayList_and_Collection_P2.Ranks;
import l14_ArrayList_and_Collection_P2.Suits;

class CardTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCardInt() {
		fail("Not yet implemented");
	}
//
//	@Test
//	void testCardIntInt() {
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
//	void testLessThanBySuit() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testLessThanByRank() {
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

	
	 /**
     * Test of rank method, of class Card.
     */
    @Test
    public void testRank() {
        System.out.println("rank");
        Card instance = new Card(Ranks.SEVEN, Suits.CLUBS);
        int expResult = Ranks.SEVEN;
        int result = instance.rank();
        assertEquals(expResult, result);
    }

    /**
     * Test of suit method, of class Card.
     */
    @Test
    public void testSuit() {
        System.out.println("suit");
        Card instance = new Card(Ranks.ACE, Suits.SPADES);
        int expResult =Suits.SPADES;
        int result = instance.suit();
        assertEquals(expResult, result);
    }

    /**
     * Test of sameSuit method, of class Card.
     */
    @Test
    public void testSameSuit() {
        System.out.println("sameSuit");
        Card c = new Card(Ranks.EIGHT, Suits.DIAMONDS);
        Card instance = new Card(Ranks.NINE, Suits.DIAMONDS);
        assertEquals(c.suit(), instance.suit());       
    }

    /**
     * Test of sameRank method, of class Card.
     */
    @Test
    public void testSameRank() {
        System.out.println("sameRank");
        Card c = new Card(Ranks.EIGHT, Suits.DIAMONDS);
        Card instance = new Card(Ranks.EIGHT, Suits.SPADES);
        assertEquals(c.rank(),instance.rank());
    }

    /**
     * Test of rankDiff method, of class Card.
     */
    @Test
    public void testRankDiff() {
        System.out.println("rankDiff");
        Card c = new Card(Ranks.EIGHT, Suits.DIAMONDS);
        Card instance = new Card(Ranks.JACK, Suits.SPADES);
        int expResult = instance.rank() - c.rank() ;
        int result = instance.rankDiff(c);
        assertEquals(expResult, result);
    }
	
}

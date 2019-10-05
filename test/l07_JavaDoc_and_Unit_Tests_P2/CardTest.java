package l07_JavaDoc_and_Unit_Tests_P2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import l07_JavaDoc_and_Unit_Tests_P2.Card;
import l07_JavaDoc_and_Unit_Tests_P2.Ranks;
import l07_JavaDoc_and_Unit_Tests_P2.Suits;

class CardTest {

	@BeforeEach
	void setUp() throws Exception {
		// find out what is going on 
		System.out.println("setup ....");
	}

	@AfterEach
	void tearDown() throws Exception {
	}
//
//	@Test
//	void testCardInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testCardIntInt() {
//		fail("Not yet implemented");
//	}
//
	@Test
	void testRank() {
		System.out.println("Rank");
        Card instance = new Card(Ranks.QUEEN , Suits.HEARTS);
        int expResult = Ranks.QUEEN;
        int result = instance.rank();
        assertEquals(expResult, result);
	}
//
//	@Test
//	void testSuit() {
//		fail("Not yet implemented");
//	}

	@Test
	void testSameSuit() {

		System.out.println("sameSuit");
        Card c = new Card(Ranks.ACE, Suits.CLUBS);
        Card instance = new Card(Ranks.FOUR, Suits.CLUBS);
        Card instance2 = new Card(Ranks.JACK, Suits.HEARTS);
        boolean expResult = true;
        boolean expResult2 = false;
        boolean result = instance.sameSuit(c);
        boolean result2 = instance2.sameSuit(c);
        assertEquals(expResult, result);
        assertEquals(expResult2, result2);
	}

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
//	void testRankDiff() {
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
	
	//Extra////////////////////////////////////
	
	 @Test
	    public void testIsRedExpectTrueWhenCardIsHearts() {
	        //arrange - this test was setup correctly
	        Card instance = new Card(Ranks.TWO, Suits.HEARTS);
	        boolean expResult = true;
	        //act
	        boolean result = instance.isRed();
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testIsRedExpectTrueWhenCardIsDiamonds() {
	        //arrange - this test was setup correctly
	        Card instance = new Card(Ranks.NINE, Suits.DIAMONDS);
	        boolean expResult = true;
	        //act
	        boolean result = instance.isRed();
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testIsBlackExpectTrueWhenCardIsSpades() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.TWO, Suits.SPADES);
	        boolean expResult = true;
	        //act
	        boolean result = instance.isBlack();
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testIsBlackExpectTrueWhenCardIsClubs() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.EIGHT, Suits.CLUBS);
	        boolean expResult = true;
	        //act
	        boolean result = instance.isBlack();
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testIsFaceExpectTrueWhenCardIsJack() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.JACK, Suits.CLUBS);
	        boolean expResult = true;
	        //act
	        boolean result = instance.isFace();
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testIsFaceExpectTrueWhenCardIsQueen() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.QUEEN, Suits.DIAMONDS);
	        boolean expResult = true;
	        //act
	        boolean result = instance.isFace();
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testIsFaceExpectTrueWhenCardIsKing() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.KING, Suits.SPADES);
	        boolean expResult = true;
	        //act
	        boolean result = instance.isFace();
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testIsFaceExpectFalseWhenCardIsAce() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.ACE, Suits.CLUBS);
	        boolean expResult = false;
	        //act
	        boolean result = instance.isFace();
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testIsFaceExpectFalseWhenCardIsTen() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
	        boolean expResult = false;
	        //act
	        boolean result = instance.isFace();
	        //assert
	        assertEquals(expResult, result);
	    }
	    
	    @Test
	    public void testSameColorExpectTrueWhenSpadesSpades() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.TEN, Suits.SPADES);
	        Card c = new Card(Ranks.FIVE, Suits.SPADES);
	        boolean expResult = true;
	        //act
	        boolean result = instance.sameColor(c);
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testSameColorExpectTrueWhenSpadesClubs() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.TEN, Suits.SPADES);
	        Card c = new Card(Ranks.FIVE, Suits.CLUBS);
	        boolean expResult = true;
	        //act
	        boolean result = instance.sameColor(c);
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testSameColorExpectTrueWhenHeartsDiamonds() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
	        Card c = new Card(Ranks.FIVE, Suits.DIAMONDS);
	        boolean expResult = true;
	        //act
	        boolean result = instance.sameColor(c);
	        //assert
	        assertEquals(expResult, result);
	    }

	    @Test
	    public void testSameColorExpectTrueWhenHeartsHearts() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
	        Card c = new Card(Ranks.FIVE, Suits.HEARTS);
	        boolean expResult = true;
	        //act
	        boolean result = instance.sameColor(c);
	        //assert
	        assertEquals(expResult, result);
	    }
	    
	    @Test
	    public void testSameColorExpectFalseWhenHeartsSpades() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
	        Card c = new Card(Ranks.FIVE, Suits.SPADES);
	        boolean expResult = false;
	        //act
	        boolean result = instance.sameColor(c);
	        //assert
	        assertEquals(expResult, result);
	    }
	    
	    @Test
	    public void testSameColorExpectFalseWhenClubsDiamonds() {
	        //arrange TODO: arrange this test properly.
	        Card instance = new Card(Ranks.TEN, Suits.DIAMONDS);
	        Card c = new Card(Ranks.FIVE, Suits.CLUBS);
	        boolean expResult = false;
	        //act
	        boolean result = instance.sameColor(c);
	        //assert
	        assertEquals(expResult, result);
	    }
	
}

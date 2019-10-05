package l07_JavaDoc_and_Unit_Tests;


import java.util.Random;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import l07_JavaDoc_and_Unit_Tests_P2.Card;
import l07_JavaDoc_and_Unit_Tests_P2.Ranks;
import l07_JavaDoc_and_Unit_Tests_P2.Suits;

class PlayingCardsRunTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBlackcard() {
		Random gen = new Random();
        Card c1 = new Card(Ranks.ACE,Suits.HEARTS);
        Card c2 = new Card(gen.nextInt(52));
        
       
        System.out.printf("Cards: %s %s\n",c1.toString(),c2.toString());
        System.out.printf("SAME RANK : %s\n", c1.sameRank(c2));
        System.out.printf("SAME SUIT : %s\n", c1.sameSuit(c2));
        System.out.printf("SAME CARD : %s\n", c1.sameCard(c2));
    	}

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
//	void testToString() {
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

}

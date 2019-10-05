package l07_JavaDoc_and_Unit_Tests_P2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlackBoxTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void testFizzBuzz() {
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
	
	/////////////////////////
	
		
		public void BBT() {
			
			//arrange - setup the test
	        BlackBox instance = new BlackBox(); // we need a BlackBox
	        int number = 3;                     // when the number is 3
	        String expectedResult = "fizz";     // we expect "fizz"
	        //act - call the method 
	        String actualResult = instance.FizzBuzz(number);
	        //assert - check whether you got what you expected!
	        assertEquals(expectedResult, actualResult);
//	        testFizzBuzzExpectBuzzWhenNumberIs5();
//	        testFizzBuzzExpectEmptyWhenNumberIs1();
//	        testFizzBuzzExpectFizzBuzzWhenNumberIs15();
		}
		
	    // TEST2: This test was not setup correctly and so it fails, please fix it!
	    @Test
	    public void testFizzBuzzExpectBuzzWhenNumberIs5() {
	        //arrange - setup the test
	        BlackBox instance = new BlackBox(); // we need a BlackBox
	        int number = 5;                    // when the number is 5
	        String expectedResult = "buzz";     // we expect "buzz"
	        //act - call the method 
	        String actualResult = instance.FizzBuzz(number);
	        //assert - check whether you got what you expected!
	        assertEquals(expectedResult, actualResult);
	    }
	    
	    // TEST3: This test was not setup correctly and so it fails, please fix it!
	    @Test
	    public void testFizzBuzzExpectEmptyWhenNumberIs1() {
	        //arrange - setup the test
	        BlackBox instance = new BlackBox(); // we need a BlackBox
	        int number = 1;                     // when the number is 1
	        String expectedResult = "";         // we expect ""
	        //act - call the method 
	        String actualResult = instance.FizzBuzz(number);
	        //assert - check whether you got what you expected!
	        assertEquals(expectedResult, actualResult);
	    }
	    
	    // TEST4: Write this entire test yourself
	    @Test
	    public void testFizzBuzzExpectFizzBuzzWhenNumberIs15() {
	        //arrange - setup the test
	        BlackBox instance = new BlackBox(); // we need a BlackBox
	        int number = 15;                    // when the number is 15
	        String expectedResult = "fizzbuzz"; // we expect "fizzbuzz"
	        //act - call the method 
	        String actualResult = instance.FizzBuzz(number);
	        //assert - check whether you got what you expected!
	        assertEquals(expectedResult, actualResult);
	    }

}

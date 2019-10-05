package l07_JavaDoc_and_Unit_Tests_P2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void testRectangleIntInt() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testRectangle() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetWidth() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetWidth() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testGetLength() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testSetLength() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testArea() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testPerimeter() {
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

	////////////////////////////////////////
	
	    
		 /**
	     * Test of getWidth method, of class Rectangle.
	     */
	    @Test
	    public void testGetWidthExpect10WhenRectangleIsL5W10() {
	        //arrange - setup test
	        Rectangle instance = new Rectangle(5,10);
	        int expResult = 10;
	        //act
	        int result = instance.getWidth();
	        //assert
	        assertEquals(expResult, result);
	    }

	    /**
	     * Test of setWidth method, of class Rectangle.
	     */
	    @Test
	    public void testSetWidthExpect7WhenWidthSetTo7() {
	        //arrange
	        int width = 7;
	        Rectangle instance = new Rectangle(5,10);
	        int expResult = 7;
	        //act
	        int result = instance.setWidth(width);
	        //assert
	        assertEquals(expResult, result);
	    }

	    /**
	     * Test of getLength method, of class Rectangle.
	     */
	    @Test
	    public void testGetLengthExpect8WhenRectangleIsL8W3() {
	        //arrange  - TODO setup the test so that it passes
	        Rectangle instance = new Rectangle(8,3);
	        int expResult = 8;
	        //act
	        int result = instance.getLength();
	        //assert
	        assertEquals(expResult, result);
	    }

	    /**
	     * Test of setLength method, of class Rectangle.
	     */
	    @Test
	    public void testSetLengthExpect9WhenLengthSetTo9() {
	        //arrange  - TODO setup the test so that it passes
	        int length = 9;
	        Rectangle instance = new Rectangle(5,10);
	        int expResult = 9;
	        //act
	        int result = instance.setLength(length);
	        //assert
	        assertEquals(expResult, result);
	    }

	    /**
	     * Test of area method, of class Rectangle.
	     */
	    @Test
	    public void testAreaExpect50WhenL5W10() {
	        //arrange  - TODO setup the test so that it passes
	        Rectangle instance = new Rectangle(5,10);
	        int expResult = 50;
	        //act
	        int result = instance.area();
	        //assert
	        assertEquals(expResult, result);
	    }

	    /**
	     * Test of perimeter method, of class Rectangle.
	     */
	    @Test
	    public void testPerimeterExpect30WhenL5W10() {
	        //arrange  - TODO setup the test so that it passes
	        Rectangle instance = new Rectangle(5,10);
	        int expResult = 30;
	        //act
	        int result = instance.perimeter();
	        //assert
	        assertEquals(expResult, result);
	    }
	}
	
	


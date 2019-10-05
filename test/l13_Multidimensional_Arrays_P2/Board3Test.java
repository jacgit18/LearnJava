package l13_Multidimensional_Arrays_P2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import l13_Multidimensional_Arrays_P2.Board3;
import l13_Multidimensional_Arrays_P2.Marker3;

class Board3Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBoard3() {
		fail("Not yet implemented");
	}

//	@Test
//	void testBoard3Marker3ArrayArray() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testClear() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testDraw() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testPlace() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testWinner() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	void testFull() {
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
	
	/**
     * Winner in first row
     */
    @Test
    public void testWinnerInFirstRow() {
        System.out.println("X Winner in 1st row");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                { Marker3.X, Marker3.X, Marker3.X },
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.EMPTY },
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.EMPTY }
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }
    
    /**
     * Winner in second row
     */
    @Test
    public void testWinnerInSecondRow() {
        System.out.println("X Winner in 2nd row");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.EMPTY }, 
                { Marker3.X, Marker3.X, Marker3.X },
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.EMPTY}
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    
    
    /**
     * Winner in third row
     */
    @Test
    public void testWinnerInThirdRow() {
        System.out.println("X Winner in 3rd row");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.EMPTY }, 
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.EMPTY} ,
                {Marker3.X, Marker3.X, Marker3.X }                    
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    
    
    /**
     * Winner in first column
     */
    @Test
    public void testWinnerInFirstCol() {
        System.out.println("X Winner in 1st col");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                { Marker3.X, Marker3.EMPTY, Marker3.EMPTY },
                {Marker3.X, Marker3.EMPTY, Marker3.EMPTY },
                {Marker3.X, Marker3.EMPTY, Marker3.EMPTY }
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }
    
    /**
     * Winner in second column
     */
    @Test
    public void testWinnerInSecondCol() {
        System.out.println("X Winner in 2nd col");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                {Marker3.EMPTY, Marker3.X, Marker3.EMPTY }, 
                { Marker3.EMPTY, Marker3.X, Marker3.EMPTY },
                {Marker3.EMPTY, Marker3.X, Marker3.EMPTY}
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    
    
    /**
     * Winner in third column
     */
    @Test
    public void testWinnerInThirdCol() {
        System.out.println("X Winner in 3rd col");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.X }, 
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.X} ,
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.X }                    
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    

        /**
     * Winner on down angle
     */
    @Test
    public void testWinnerOnDownAngle() {
        System.out.println("X Winner on down angle");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                { Marker3.X, Marker3.EMPTY, Marker3.EMPTY },
                {Marker3.EMPTY, Marker3.X, Marker3.EMPTY },
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.X}
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }
    
    /**
     * Winner on up angle
     */
    @Test
    public void testWinnerOnUpAngle() {
        System.out.println("X Winner on up angle");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                {Marker3.EMPTY, Marker3.EMPTY, Marker3.X }, 
                { Marker3.EMPTY, Marker3.X, Marker3.EMPTY },
                {Marker3.X, Marker3.EMPTY, Marker3.EMPTY}
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    
    
    /**
     * Winner == none
     */
    @Test
    public void testWinnerIsNoWinner() {
        System.out.println("There is no winner");
        Marker3 marker = Marker3.X;
        Board3 instance = new Board3(new Marker3[][] { 
                {Marker3.O, Marker3.X, Marker3.X }, 
                {Marker3.X, Marker3.O, Marker3.O} ,
                {Marker3.X, Marker3.O, Marker3.X }                    
        });
        boolean expResult = false;
        boolean result = instance.Winner(marker) || instance.Winner(Marker3.O);
        assertEquals(expResult, result);
    }    

}

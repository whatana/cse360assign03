package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator myCalculator = new Calculator();
		
		assertNotNull(myCalculator);
	}
	
	@Test
	public void testGetTotalEqualZero() {
		Calculator myCalculator = new Calculator();
		assertEquals(0, myCalculator.getTotal());
	}
	
	
	@Test
	public void testAddPositive() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(5);
		myCalculator.add(7);
		myCalculator.add(10);
		
		assertEquals(22, myCalculator.getTotal());
	}
	
	@Test
	public void testAddNegative() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(-4);
		myCalculator.add(-8);
		myCalculator.add(-15);
		
		assertEquals(-27, myCalculator.getTotal());
	}
	
	@Test
	public void testAddBoth() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(-9);
		myCalculator.add(11);
		myCalculator.add(-3);
		myCalculator.add(5);
		
		assertEquals(4, myCalculator.getTotal());
	}
	
	@Test
	public void testSubtractPositive() {
		Calculator myCalculator = new Calculator();
		myCalculator.subtract(11);
		myCalculator.subtract(30);
		myCalculator.subtract(51);
		
		assertEquals(-92, myCalculator.getTotal());
	}
	
	@Test
	public void testSubtractNegative() {
		Calculator myCalculator = new Calculator();
		myCalculator.subtract(-34);
		myCalculator.subtract(-57);
		myCalculator.subtract(-3);
		
		assertEquals(94, myCalculator.getTotal());
	}
	
	@Test
	public void testSubtractBoth() {
		Calculator myCalculator = new Calculator();
		myCalculator.subtract(-34);
		myCalculator.subtract(57);
		myCalculator.subtract(-6);
		myCalculator.subtract(9);
		
		assertEquals(-26, myCalculator.getTotal());
	}
	
	@Test
	public void testSubtractZero() {
		Calculator myCalculator = new Calculator();
		
		myCalculator.subtract(0);
		
		assertEquals(0, myCalculator.getTotal());
	}
	
	@Test
	public void testMultiplyPostive() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(2);
		myCalculator.multiply(8);
		myCalculator.multiply(3);
		myCalculator.multiply(5);
		
		assertEquals(240, myCalculator.getTotal());
	}
	
	@Test
	public void testMultiplyNegative() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(2);
		myCalculator.multiply(-8);
		
		assertEquals(-16, myCalculator.getTotal());
	}
	
	@Test
	public void testMultiplyCoupleNeg() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(2);
		myCalculator.multiply(-8);
		myCalculator.multiply(-3);
		
		assertEquals(48, myCalculator.getTotal());
	}
	
	@Test
	public void testMultiplyByZero() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(2);
		myCalculator.multiply(0);
		
		assertEquals(0, myCalculator.getTotal());
	}
	
	@Test
	public void testDividePostive() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(12);
		myCalculator.divide(3);
		
		assertEquals(4, myCalculator.getTotal());
	}
	
	@Test
	public void testDivideNegative() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(12);
		myCalculator.divide(-3);
		
		assertEquals(-4, myCalculator.getTotal());
	}
	
	@Test
	public void testDivideDoubleNegative() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(-12);
		myCalculator.divide(-3);
		
		assertEquals(4, myCalculator.getTotal());
	}
	
	@Test
	public void testDivideZero() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(12);
		myCalculator.divide(0);
		
		assertEquals(0, myCalculator.getTotal());
	}
	
	@Test
	public void testDivideNotDivisible() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(12);
		myCalculator.divide(5);
		
		assertEquals(2, myCalculator.getTotal());
	}
	
	@Test
	public void testGetHistory() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(12);
		assertEquals("0 + 12", myCalculator.getHistory());
		
	}
	
	@Test
	public void testGetHistoryWholePart() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(12);
		myCalculator.divide(3);
		myCalculator.multiply(6);
		myCalculator.subtract(5);
		assertEquals("0 + 12 / 3 * 6 - 5", myCalculator.getHistory());
		
	}
	
	@Test
	public void testGetHistoryOneMore() {
		Calculator myCalculator = new Calculator();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.multiply(2);
		myCalculator.add(5);
		assertEquals("0 + 4 - 2 * 2 + 5", myCalculator.getHistory());
		
	}
}

	


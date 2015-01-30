package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int output = calc.add(5, -8);
		int expected = -3;
		assertEquals(output, expected);
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		int output = calc.subtract(-10, 20);
		int expected = -30;
		assertEquals(output, expected);
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		int output = calc.multiply(2, -10);
		int expected = -20;
		assertEquals(output, expected);
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		double output = calc.divide(35.0, -3.0);
		double expected = -35.0/3.0;
		assertEquals(output,expected, 0.00);
	}
	
	@Test
	public void testModulus() {
		Calculator calc = new Calculator();
		int output = calc.modulus(7, 5);
		int expected = 2;
		assertEquals(output,expected);
	}

}

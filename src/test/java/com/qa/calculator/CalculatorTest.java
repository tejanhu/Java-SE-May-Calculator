package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void addTest() {
		Calculator calc = new Calculator(new Adder());
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void multiplyTest() {
		Calculator calc = new Calculator(new Multiplier());
		int actualValue = calc.multiply(2, 2);
		Assert.assertEquals(4, actualValue);
	}
	
	@Test
	public void subtractTest() {
		Calculator calc = new Calculator();
		int actualValue = calc.subtract(2, 2);
		Assert.assertEquals(0, actualValue);
	}
	
	@Test
	public void divideTest() {
		Calculator calc = new Calculator(new Dividor());
		int actualValue = calc.divide(5, 5);
		Assert.assertEquals(1, actualValue);
	}

}

package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calc = new Calculator(new Adder());
		int actualValue = calc.add(2, 2);
		Assert.assertEquals(4, actualValue);
	}

}

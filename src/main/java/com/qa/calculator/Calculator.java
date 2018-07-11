package com.qa.calculator;

public class Calculator {
	
	Functionality multiplier = new Functionality();

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int multiply(int num1, int num2) {
		return multiplier.multiply(num1, num2);
	}

}

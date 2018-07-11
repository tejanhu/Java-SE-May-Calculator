package com.qa.calculator;

public class Calculator {
	
	Functionality subtractor = new Functionality();
	Functionality dividor = new Functionality();

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}
	
	public int subtract(int num1, int num2) {
		return subtractor.subtract(num1, num2);
	}
	
	public int divide(int num1, int num2) {
		return dividor.divide(num1, num2);
	}

}

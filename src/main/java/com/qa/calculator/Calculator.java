package com.qa.calculator;

public class Calculator {
	
	private iAlgorithm iAlgo;
	
	public Calculator(iAlgorithm iAlgo) {
		this.iAlgo = iAlgo;
	}
	
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
		return iAlgo.calc(num1, num2);
	}

}

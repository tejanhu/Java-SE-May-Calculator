package com.qa.calculator;

public class Calculator {

	private iAlgorithm iAlgo;
	
	public Calculator(iAlgorithm iAlgo) {
		this.iAlgo = iAlgo;
	}
	
	public int add(int num1, int num2) {
		return this.iAlgo.calc(num1, num2);
	}

}

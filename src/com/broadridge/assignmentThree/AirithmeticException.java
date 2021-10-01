package com.broadridge.assignmentThree;

public class AirithmeticException {

	public static void main(String[] args) throws ArithmeticException {
	
		method();
		
	}

	static void method() throws ArithmeticException {
		throw new ArithmeticException("ArithmeticException Occurred");
	}
}
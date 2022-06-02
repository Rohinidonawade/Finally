package com.vstl.exceptionHandling;

public class FinallyKeyword {

	public void division(int intDivisible) {
		
		try {
			int intSumNumbers = 200; 
			int intResult = intSumNumbers/intDivisible;
			System.out.println("The Result is: "+intResult);
			
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Inside catch block" +arithmeticException.getMessage());
		}
		finally {
			System.out.println("Inside finally block exicute");
		}
	}
}

package com.vstl.exceptionHandling;

public class ThrowKeyword {

		
		//throw :-is used to throw the user defined exception object to JVM explicitly for the purpose we will use throw keyword.
	public void eligibilityForVote(int intAge) {
	
		if(intAge<18) {
			throw new ArithmeticException("Not eligible");
		}
		else {
			System.out.println("Eligible for Vote");
	    }
	}	
	public void checkThrows()  {
		
		try {
			throw new Exception("Handle exception");
			
		} catch (Exception exception) {
			System.out.println("Exception:");
			
		}
	}	
}	



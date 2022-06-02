package com.vstl.exceptionHandling;

public class TestJavaExceptionHandling {


	public static void main(String[] args) throws Exception {

		JavaExceptionHandling objExceptionHandling = new JavaExceptionHandling();
		objExceptionHandling.calculation(400);
System.out.println("*******************");

		objExceptionHandling.getEmployeeName();
System.out.println("*******************");
		
		objExceptionHandling.getMobileNumber();
System.out.println("*******************");

		objExceptionHandling.getEmployeeDetails();
System.out.println("*******************");
		
		objExceptionHandling.getCompanyName();
System.out.println("*******************");
		
	
              //ThrowsKeyword
		ThrowsKeyword objThrowsKeyword = new ThrowsKeyword();
		objThrowsKeyword.getCalculationResult();
System.out.println("*******************");
		
		      //ThrowKeyword
		ThrowKeyword objThrowKeyword = new ThrowKeyword();		 
		objThrowKeyword.eligibilityForVote(20);

System.out.println("*******************");
		
             //FinallyKeyword
		FinallyKeyword objFinallyKeyword = new FinallyKeyword();
		objFinallyKeyword.division(0);
	}	
} 



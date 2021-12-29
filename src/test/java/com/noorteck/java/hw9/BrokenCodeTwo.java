package com.noorteck.java.hw9;

public class BrokenCodeTwo {

	// correct main method - public static void..
	public static void   main(String[] args) { //String needs to start with upper case

		
		double tempOne = 84.7; //data type double must be used for decimals
		 int tempTwo = 66;
		 String result; 
		
		//no need of third &, no need of double quotes, correct greater than or equal sign is >=
		if (tempOne <= 0 && tempTwo >= 100) { 
			result = "true"; //missing " for String data type
			
		//should be else if statement, correct greater than or equal sign is >=	
		} else if (tempOne >= 100 && tempTwo <= 0) { //no need of ;
			result = "true"; //missing " for String data type
		} else { 
			result= "false"; //missing " for String data type
		}
		
		System.out.println(result); //variable is not plural
		
		String season = "Monday";

		switch (season) { //switch requires controlling expression
		case "fall": //needs double quotes and colon
			System.out.println("Recovering from hot weather");
			break;
		case "winter":
			System.out.println("Toooo cold");	
			 
		case "s": //needs double quotes and colon
			System.out.println("Recovering from cold weather");			
			break;
		case "summer": //needs colon
			System.out.println("Toooo hot");			
			 
		default: //needs colon
			System.out.println("Season does not exist!");	
		}
	
		//...for must be lower case, int must be lower case, no need of ; before the curly brace
		for(int i = 1; i <10; i++) {  // i has no value assigned; needs semicolon after 10...
		
			
			if (i == 5) {//no need of ; and no need of parentheses, needs curly open brace
		
				System.out.println("I equals to 5"); //missing semicolon
			} else {  //no need of parenthesis 
				System.out.println("i not equals"); //needs double quotes
			}
		}
		
	}

}

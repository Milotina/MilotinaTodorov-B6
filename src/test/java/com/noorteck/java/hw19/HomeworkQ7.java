package com.noorteck.java.hw19;

public class HomeworkQ7 {

	String helloTo(String strOne) {

		String result = "Hello ";
		return result + strOne;
	}

	public static void main(String[] args) {

		HomeworkQ7 obj = new HomeworkQ7();

		System.out.println(obj.helloTo("Denis"));
		System.out.println(obj.helloTo("Malek"));
		System.out.println(obj.helloTo("Sara"));
	}
}
/**
 Write a method that takes one String parameter (name) and the method returns new
String value appending “Hello” to name parameter

Access Modifier: default
Non-Access Modifier: non-static
Return Type: String
Method Name: helloTo
Parameter1: String strOne
 
*/

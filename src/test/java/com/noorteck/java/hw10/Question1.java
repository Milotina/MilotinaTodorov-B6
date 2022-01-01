package com.noorteck.java.hw10;

public class Question1 {

	public static void main(String[] args) {
		calculate(8.0, 4.0, '+');
		calculate(4.2, 2.2, '-');
		calculate(9.3, 7.3, '*');
		calculate(5.6, 2.0, '/');
		calculate(3.7, 1.6, '%');
	}

	public static void calculate(double numOne, double numTwo, char mathSign) {

		if (mathSign == '+') {
			System.out.println(numOne + " + " + numTwo + " = " + (numOne + numTwo));
		} else if (mathSign == '-') {
			System.out.println(numOne + " - " + numTwo + " = " + (numOne - numTwo));
		} else if (mathSign == '*') {
			System.out.println(numOne + " * " + numTwo + " = " + (numOne * numTwo));
		} else if (mathSign == '/') {
			System.out.println(numOne + " / " + numTwo + " = " + (numOne / numTwo));
		} else if (mathSign == '%') {
			System.out.println(numOne + " % " + numTwo + " = " + (numOne % numTwo));
		} else {
			System.out.println("Error");
		}
	}

}

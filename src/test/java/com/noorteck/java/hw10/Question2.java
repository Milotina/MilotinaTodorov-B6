package com.noorteck.java.hw10;

public class Question2 {

	public static void main(String[] args) {
		getGender('m');
		getGender('F');
	}

	public static void getGender(char gender) {

		if (gender == 'f' || gender == 'F') {
			System.out.println("Female");
		} else if (gender == 'm' || gender == 'M') {
			System.out.println("Male");
		} else {
			System.out.println("Error");

		}
	}
}

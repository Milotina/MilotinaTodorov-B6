package com.noorteck.java.hw10;

public class Question2 {

	public static void main(String[] args) {
		getGender('m');
		getGender('F');
	}

	public static void getGender(char gender) {
		if (gender == 'm') {
			System.out.println("Male");
		} else if (gender == 'F') {
			System.out.println("Female");
		} else {
			System.out.println("Error.");
		}
	}

}

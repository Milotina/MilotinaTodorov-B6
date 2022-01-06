package com.noorteck.java.hw11;

public class MonkeyStatus {

	public static void main(String[] args) {

		boolean areWeInTrouble = monkeyTrouble(true, false);
		System.out.println(areWeInTrouble);

	}

	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

		boolean result = false;

		if ((aSmile == true && bSmile == true) || (aSmile == false && bSmile == false)) {
			result = true;
		} else {
			result = false;
		}

		return result;

	}

}

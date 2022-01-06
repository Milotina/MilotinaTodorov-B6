package com.noorteck.java.hw11;

public class SleepStatus {

	public static void main(String[] args) {

		boolean amIsleeping = sleepIn(false, false);
		System.out.println(amIsleeping);

	}

	public static boolean sleepIn(boolean isWeekday, boolean isVacation) {

		boolean result = false;

		if (isWeekday == false || isVacation == true) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}

}

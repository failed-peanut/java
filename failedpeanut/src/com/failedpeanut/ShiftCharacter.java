package com.failedpeanut;
/*
Given two strings A and B, return whether or not A can be shifted some number of times to get B.

For example, 
	if A is abcde and B is cdeab, return true. 
	If A is abc and B is acb, return false.
*/

public class ShiftCharacter {

	public static void main(String... args) {
		String a = "abcde";
		String b = "cdeab";

		boolean result = shiftCharacter(a, b);
		System.out.println(result);

	}

	private static boolean shiftCharacter(String a, String b) {
		if (a.equals(b))
			return true;

		int i = 0;
		int j = 1;
		String subStr = "";
		while (i < a.length()) {
			subStr = subStr + a.substring(i, j);
			if ((a.substring(j) + subStr).equals(b)) {
				return true;
			}

			j++;
			i++;
		}

		return false;
	}
}
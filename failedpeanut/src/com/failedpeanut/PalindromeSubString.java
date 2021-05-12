package com.failedpeanut;

/*Given a string, find the longest palindromic contiguous substring.

 *  If there are more than one with the maximum length, return any one.



For example, the longest palindromic substring of "aabcdcb" is "bcdcb". 

The longest palindromic substring of "bananas" is "anana".

 */

public class PalindromeSubString {

	public static void main(String[] args) {

		String s = "aabcdcb";

		System.out.println(getLongestPalindromicSubString(s));

	}

	private static String getLongestPalindromicSubString(String s) {

		if (checkForValidString(s))

			return "Invalid String";

		if (checkPalindrome(s))

			return s;

		int i = 0;

		int k = i + 1;

		String biggestSubString = "";

		while (i < s.length()) {

			if (k == s.length()) {

				if (checkPalindrome(s.substring(i, k)) && s.substring(i, k).length() > 1

						&& biggestSubString.length() < s.substring(i, k).length()) {

					biggestSubString = s.substring(i, k);

				}

				i++;

				k = i;

			}

			if (checkPalindrome(s.substring(i, k)) && s.substring(i, k).length() > 1

					&& biggestSubString.length() < s.substring(i, k).length()) {

				biggestSubString = s.substring(i, k);

			}

			k++;

		}

		return biggestSubString.length() > 0 ? biggestSubString : "NO longest palindromic substring PRESENT";

	}

	private static boolean checkForValidString(String s) {

		if (null == s)

			return true;

		if (s.length() == 0)

			return true;

		return false;

	}

	private static boolean checkPalindrome(String s) {

		if (s.equals(new StringBuffer(s).reverse().toString()))

			return true;

		return false;

	}

}

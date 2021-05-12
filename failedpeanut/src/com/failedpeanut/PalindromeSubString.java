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
		if (checkForValidString(s)) return "Invalid String"; // check if given String is valid or not
		if (checkPalindrome(s)) return s; // check if given String itself is a palindrome
		int i = 0; // initialize 'i' that should point to first character of string.
		int k = i + 1; // initialize 'k' that will point to next character of String (i+1).
		String biggestSubString = ""; // Declare a temp String that holds the biggest Substring.
		while (i < s.length()) { // iterate through String
			if (k == s.length())// if 'k' reaches the end of the String length
			   { 
				/*
				 * 1. check if the substring b/w i and k is palindrome.
				 * 2. Ignore if the
				 * substring is of length 1 or just a single character. 
				 * 3. check the length of
				 * the declared temp String with substring we got. If its less then make
				 * substring as temp string and move on to the next loop.
				 */
				if (checkPalindrome(s.substring(i, k)) && s.substring(i, k).length() > 1 && biggestSubString.length() < s.substring(i, k).length())
							biggestSubString = s.substring(i, k);
				i++; // NOTE: increment 'i' only when 'k' completes its cycle.
				k = i; // lets 'k' continue again from 'i' to get remaining palindromic substring.
				}
			/*
			 * The above condition is repeated again to check the palindromic substring when
			 * 'k' have not reached end 'can optimize it if required'- give a try.
			 */
			if (checkPalindrome(s.substring(i, k)) && s.substring(i, k).length() > 1 && biggestSubString.length() < s.substring(i, k).length())
							biggestSubString = s.substring(i, k);
			k++;// increment 'k' which points to next character in String and continues to reach till string length then reset k to i by incrementing i.
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

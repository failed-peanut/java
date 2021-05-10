package com.failedpeanut;

import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * 
Given a string find the distinct characters in it and count it.
input:  DISTINCT
Output: DSNC 4
 */
public class DistinctCharactersWithCount {

	public static void main(String[] args) {
		String sampleString = "DISTINCT";
		printDistinctCharacterWithCount(sampleString);
		printDistinctCharacterWithCountusingStreams(sampleString);

	}

	private static void printDistinctCharacterWithCountusingStreams(String sampleString) {
		Set<Entry<String, Integer>> st = sampleString.chars() // returns IntStream of characters with its values (here
																// value of character is its ASCII code)
				.mapToObj(e -> (char) e) // mapping each character's ASCII value to char data
				.map(charToString -> charToString.toString()) // converting char to String : Its actually not required
																// can avoid it
				.collect(Collectors.toMap(key -> key, s -> 1, Integer::sum)) // converting String to Map: where each key
																				// is String value is its count.
																				// Integer::sum acts as BiFunction
				.entrySet() // get EntrySet from the Map. Each object will be of type: Entry<String,
							// Integer>
				.stream() // getting Stream of EntrySet objects to apply filter
				.filter(e -> e.getValue() < 2) // adding condition (Predicate) to check for the count.
				.collect(Collectors.toSet()); // Collect Set of EntrySet's.

		st.stream().forEach(e -> System.out.print(e.getKey())); // print distinct characters
		System.out.println(" " + st.stream().count());// get count of distinct characters
	}

	private static void printDistinctCharacterWithCount(String sampleString) {
		if (null == sampleString || sampleString.length() <= 0) {
			System.out.println("Invalid String");
			return;
		}

		String tempString = ""; // create a temp String
		int count = 0; // initialize count to count the occurrences of characters
		for (int i = 0; i < sampleString.length(); i++) { // loop through given String
			char c = sampleString.charAt(i); // get the character at index
			if (tempString.indexOf(c) < 0) { // check if character is present in given String (if it returns less than
												// zero then there is no character)
				tempString = tempString + c; // if no character then concatenate character to our temp String
				count++; // increase the count
			} else {
				tempString = tempString.replace(c, ' '); // if character is present replace it with blank
				count--; // decrease the count
			}
		}
		System.out.print(tempString.replaceAll("\\s", "")); // remove all spaces from the String and print it
		System.out.println(" " + count); // print the count
	}

}

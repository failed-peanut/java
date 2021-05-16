package com.failedpeanut;

/* *  * Given a sorted array arr of distinct integers, return the lowest index i for which arr[i] == i. 
 *  * Return null if there is no such index.
 * For example, given the array [-5, -3, 2, 3], return 2 since arr[2] == 2.
 *  Even though arr[3] == 3, we return 2 since it's the lowest index. */

public class LowestIndex {
	public static void main(String args[]) {
		int[] arr = { 10, 10, 2, 3, 3, 4, -3, -2 };
		int result = getLowestIndex(arr);
		System.out.println(result);
	}

	private static int getLowestIndex(int[] arr) {
		int lowestIndex = 0;
		int countFirstNumber = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] >= 0) {
				if (arr[i] == i) {
					countFirstNumber++;
					if (countFirstNumber == 1) {
						lowestIndex = arr[i];
					}
					if (lowestIndex > arr[i]) {
						lowestIndex = arr[i];
					}
				}
			}
			i++;
		}
		return lowestIndex;
	}
}
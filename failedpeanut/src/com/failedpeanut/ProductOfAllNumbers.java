package com.failedpeanut;

import java.util.Arrays;

/*
 * 
 * Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array 
 * except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected 
output would be [120, 60, 40, 30, 24].

If our input was [3, 2, 1], the expected output would be [2, 3, 6].
Follow-up: what if you can't use division?
 */
public class ProductOfAllNumbers {

	public static void main(String... strings) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int productArray[] = getProductArray(arr);
		System.out.println(Arrays.toString(productArray));

	}

	private static int[] getProductArray(int[] arr) {
		int[] productArr = new int[arr.length];
		int i = 0;
		int k = 0;
		int product = 1;
		while (i < arr.length) {

			if (i != k) {
				product = product * arr[k];
				k++;
			} else {
				k++;
			}
			if (k == arr.length) {
				k = 0;
				productArr[i] = product;
				i++;
				product = 1;

			}

		}

		return productArr;
	}

}

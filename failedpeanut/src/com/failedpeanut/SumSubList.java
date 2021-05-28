package com.failedpeanut;

import java.util.Arrays;

/* *  *  Given a list of numbers L, implement a method sum(i, j) 
 * which returns the sum from the sublist L[i:j] (including i, excluding j).
 * 
 * For example, given L = [1, 2, 3, 4, 5], sum(1, 3) should return sum([2, 3]), which is 5.
 * You can assume that you can do some pre-processing. sum() should be optimized over the pre-processing step. 
 * *  */


public class SumSubList {
	public static void main(String... strings) {
		int[] L = { 1, 2, 3, 4, 5 };
		int i = 1;
		int j = 3;
		try {
			int sum = sum(i, j, L);
			System.out.println(sum);
		} catch (NullPointerException npE) {
			System.out.println("INVALID");
		}
	}

	private static int sum(int i, int j, int[] L) {
		int[] tempList = checkIndexInRangeandAndreturnSublist(i, j, L);
		return (null != tempList) ? getSum(i, j, tempList) : null;
	}

	private static int getSum(int i, int j, int[] tempList) {
		return Arrays.stream(tempList).sum();
	}

	private static int[] checkIndexInRangeandAndreturnSublist(int i, int j, int[] L) {
		boolean checkIndexi = false;
		boolean checkIndexj = false;
		int validI = 0;
		int validJ = 0;
		try {
			if (i < j) {
				validI = L[i];
				validJ = L[j];
				checkIndexi = true;
				checkIndexj = true;
			}
		} catch (ArrayIndexOutOfBoundsException ai) {
			checkIndexi = false;
			checkIndexj = false;
		}
		return (checkIndexi && checkIndexj) ? Arrays.copyOfRange(L, i, j) : null;
	}
}
package com.failedpeanut;

import java.util.Arrays;

/*
 * Given a list of strictly positive integers,
 *  partition the list into 3 contiguous partitions which each sum up to the same value.
 * If not possible, return null.

For example, given the following list:

[3, 5, 8, 0, 8]
[1,2,3,3,3,2,3,1]
[1,2,3,3,3,2,3,1,4,4,1]
[1,2,3,3,3,2,3,1,3,2,1]
[0,5,0,5,0,5]
[1,5,1,5,0,6]

Return the following 3 partitions for [3, 5, 8, 0, 8]:

[[3, 5],
 [8, 0],
 [8]]
Which each add up to 8.
 *
 *
 */
public class IntegerListInto3ContiguousPartition {

	public static void main(String[] args) {
		int a[] = { 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1 };
		int sum = getSum(a);
		int partitionSum = sum > 0 ? sum / 3 : 0;
		if (null != getPartitions(a, partitionSum))
			Arrays.stream(getPartitions(a, partitionSum)).forEach(arr -> System.out.println(Arrays.toString(arr)));

		else
			System.out.println("null");
	}

	private static int[][] getPartitions(int[] a, int partitionSum) {
		int[] partition1 = null;
		int[] partition2 = null;
		int[] partition3 = null;
		int[][] result = new int[3][];

		int i = 0;
		int j = a.length;
		int mid = a.length / 2;
		partition1 = chechPartitionStartOfArray(a, i, mid, partitionSum);

		if (null != partition1 && partition1.length > 0)
			partition2 = chechPartitionStartOfArray(a, partition1.length, j, partitionSum);

		if (null != partition2 && partition2.length > 0)
			partition3 = chechPartitionStartOfArray(a, (partition1.length + partition2.length), j, partitionSum);

		if (null == partition1 || null == partition2 || null == partition3)
			return null;

		result[0] = partition1;
		result[1] = partition2;
		result[2] = partition3;
		return result;
	}

	private static int[] chechPartitionStartOfArray(int[] a, int startindex, int endindex, int partitionSum) {
		int[] tempArray = getsubArray(a, startindex, endindex);
		while (getSum(tempArray) > partitionSum) {
			tempArray = getsubArray(a, startindex, endindex--);
		}

		return getSum(tempArray) == partitionSum ? tempArray : null;

	}

	private static int[] getsubArray(int[] a, int i, int mid) {
		int tempArray[] = Arrays.copyOfRange(a, i, mid);
		return tempArray;
	}

	private static int getSum(int[] a) {
		int sum = Arrays.stream(a).sum();
		return sum;
	}

}
package com.failedpeanut;

/*
 * Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. 
 * Return the number of clumps in the given array.


countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */
public class Clumps {

	public static void main(String[] args) {
		// int[] a = { 1, 1, 1, 1, 1, 2, 2, 1, 1, 1 };
		// int[] a = { 1, 2, 2, 3, 4, 4};
		int[] a = { 1, 1,1, 2, 1, 1,1,3,3,1,1,1,4,5,5,5,5,2,2,0,0,3,3,3};
		// int[] a = { 1, 1, 1, 1, 1};
		//int[] a = { 1, 2, 3 };
		System.out.println("clumps="+countClumps(a));
	}

	public static int countClumps(int[] nums) {
		if (nums.length == 0)
			return 0;
		int count = 0;
		int i = 0;
		int j = 0;
		int mainCount = 0;

		boolean flag = false;
		int tem = 0;
		while (i < nums.length && j < nums.length) {
			tem = nums[i];
			if (nums[i] == nums[j]) {

				j++;
				count++;

				//System.out.println(tem + "-Count" + count);
				if (count > 1)
					flag = true;
				continue;

			}
			if (flag)
				mainCount++;

			flag = false;

			i = j;
			count = 0;

		}
		if (flag)
			mainCount++;
		//System.out.println("MainCount" + mainCount);
		return mainCount;

	}

}

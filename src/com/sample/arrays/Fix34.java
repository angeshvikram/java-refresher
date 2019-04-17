package com.sample.arrays;

import java.util.Arrays;

/*
Return an array that contains exactly the same numbers as the given array, 
but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. 
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
*/

public class Fix34 {

	public int[] fix34(int[] nums) {
		if (nums == null) {
			return null;
		}

		for (int i = 0; i < nums.length; i++) {
//			System.out.print("nums[" + i + "]: " + nums[i] + ", start: " + Arrays.toString(nums));
			// find 3
			if (nums[i] == 3) {
				// find next 4
				if (i < nums.length + 1) {
					int next4Index = nextIndex(nums, i, 4);
					if (next4Index > i) {
						// swap elements
						swap(nums, i+1, next4Index);

						i = i + 1;
					} else {
						System.out.println("next4Index: " + next4Index);
					}
				}
			} else if (nums[i] == 4) {
				if (i < nums.length + 1) {
					int next3Index = nextIndex(nums, i, 3);
					if (next3Index + 1 < nums.length && nums[next3Index+1] != 4) {
						swap(nums, i, next3Index + 1);
					} else {
						System.out.println("next3Index: " + next3Index);
					}
				}
			}
//			System.out.println(", end: " + Arrays.toString(nums));
		}
//		System.out.println("result: " + Arrays.toString(nums));
		return nums;
	}

	public int nextIndex(int[] nums, int i, int num) {
		int nextIndex = -1;
		for (int start = i; start < nums.length; start++) {
			if (nums[start] == num) {
				nextIndex = start;
				break;
			}
		}
		return nextIndex;
	}
	
	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		Fix34 fix = new Fix34();

		int[] input_1 = new int[] { 1, 3, 1, 4 };
		int[] input_2 = new int[] { 1, 3, 1, 4, 4, 3, 1 };
		int[] input_3 = new int[] { 3, 2, 3, 2, 4, 4 };
		int[] input_4 = new int[] { 5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5 };

		int[] nums = input_2;

		System.out.println("Input: " + Arrays.toString(nums));
		System.out.println("Fix34: " + Arrays.toString(fix.fix34(nums)));
	}

}

/*
 * fix34([1, 3, 1, 4]) → [1, 3, 4, 1] [1, 3, 4, 1] OK fix34([1, 3, 1, 4, 4, 3,
 * 1]) → [1, 3, 4, 1, 1, 3, 4] [1, 3, 4, 1, 4, 3, 1] X fix34([3, 2, 2, 4]) → [3,
 * 4, 2, 2] [3, 4, 2, 2] OK fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2] [3,
 * 4, 3, 4, 2, 2] OK fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2] [2, 3,
 * 4, 3, 4, 2, 2] OK fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5,
 * 5, 5, 5, 5, 3, 4, 3, 4] [5, 3, 4, 5, 5, 4, 5, 4, 3, 5, 3, 5] X fix34([3, 1,
 * 4]) → [3, 4, 1] [3, 4, 1] OK fix34([3, 4, 1]) → [3, 4, 1] [3, 4, 1] OK
 * fix34([1, 1, 1]) → [1, 1, 1] [1, 1, 1] OK fix34([1]) → [1] [1] OK fix34([]) →
 * [] [] OK fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7] [7, 3, 4, 7, 7] OK
 * fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1] [3, 4, 1, 3, 4, 1] OK
 * fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1] [3, 4, 1, 3, 4, 1] OK other
 * tests OK
 */

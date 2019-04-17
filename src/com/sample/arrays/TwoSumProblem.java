package com.sample.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSumProblem {
	public static void twoSumBruteForce(int[] arr, int sum) {
		boolean foundSum = false;
		if(arr == null) {
			System.out.println("Array is null");
			return;
		}
		
		outer: for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(i != j) {
					if((arr[i] + arr[j]) == sum) {
						System.out.println("Array elements " + arr[i] + " and " + arr[j] + " has sum of " + sum);
						foundSum = true;
						break outer;
					}
				}
			}
		}
		
		if(!foundSum) {
			System.out.println("None of the elemets have sum " + sum);
		}
	}
	
	public static void twoSumWithSorted(int[] arr, int sum) {
		boolean foundSum = false;
		if(arr == null) {
			System.out.println("Array is null");
			return;
		}
		
		if(arr.length < 2) {
			System.out.println("Array length is less than 2");
			return;
		}
		
		Arrays.sort(arr);
		int left = 0;
		int right = arr.length -1;
		while(left < right) {
			System.out.println("Checking " + arr[left] + " and " + arr[right]);
			int elementSum =  arr[left] + arr[right];
			
			if(elementSum == sum) {
				System.out.println("Array elements " + arr[left] + " and " + arr[right] + " has sum of " + sum);
				foundSum = true;
				break;
			} else if(elementSum > sum) {
				right--;
			} else {
//				left--;
				left++;
			}
		}
		
		if(!foundSum) {
			System.out.println("None of the elemets have sum " + sum);
		}
	}
	
	//best solution for arrays with are not sorted
	//Time: O(N)
	//Space: O(N)
	public static boolean twoSum(int[] arr, int sum) {
		Set<Integer> comps = new HashSet<>();
		for(int value : arr) {
			if(comps.contains(value)) {
				System.out.println("found while checking " + value);
				return true;
			}
			System.out.println("Adding " + sum + " - " + value + ": " + (sum - value));
			comps.add(sum - value);
		}
		return false;
	}
	
	private static void printSet(Set<Integer> values) {
		for(Integer value : values) {
			System.out.print(value + ", ");
		}
		System.out.println("");
	}
	
	public static void main(String[] args) {
		int[] input_1 = new int[] {2, 6, 4, 3, 5, 7};//2, 3, 4, 5, 6, 7
//		int[] input_1 = new int[] {2, 2, 4, 5, 6, 8};//2, 3, 4, 5, 6, 7
		int sum = 7;
		
		int[] arr = input_1;
		
//		twoSumBruteForce(arr, sum);
//		twoSumWithSorted(arr, sum);
		System.out.println("Checking sum: " + sum + " with array: " + Arrays.toString(arr));
		System.out.println(twoSum(arr, sum));
	}
}

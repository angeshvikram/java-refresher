package com.sample.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSumProblem {

	static boolean find3Numbers(int A[], int arr_size, int sum)
	{
	    // Fix the first element as A[i]
	    for (int i = 0; i < arr_size - 2; i++) {
	 
	        // Find pair in subarray A[i+1..n-1]
	        // with sum equal to sum - A[i]
	        Set<Integer> s = new HashSet<>();
	        int curr_sum = sum - A[i];
	        for (int j = i + 1; j < arr_size; j++) {
	            if (s.contains(curr_sum - A[j]) ) {
	                return true;
	            }
	            s.add(A[j]);
	        }
	    }
	 
	    // If we reach here, then no triplet was found
	    return false;
	}
	
//	copied
//	bool find3Numbers(int A[], int arr_size, int sum)
//	{
//	    // Fix the first element as A[i]
//	    for (int i = 0; i < arr_size - 2; i++) {
//	 
//	        // Find pair in subarray A[i+1..n-1]
//	        // with sum equal to sum - A[i]
//	        unordered_set<int> s;
//	        int curr_sum = sum - A[i];
//	        for (int j = i + 1; j < arr_size; j++) {
//	            if (s.find(curr_sum - A[j]) != s.end())
//	                return true;
//	            s.insert(A[j]);
//	        }
//	    }
//	 
//	    // If we reach here, then no triplet was found
//	    return false;
//	}
	
	public static void main(String[] args) {
		int[] array = { 1, 4, 45, 6, 10, 8 }; 
	    int sum = 22;
	    
	    System.out.println("Array: " + Arrays.toString(array));
	    System.out.println("Sum: " + sum + ", present: "  +find3Numbers(array, array.length, sum));
	}

}

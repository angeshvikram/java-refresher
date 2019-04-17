package com.sample.arrays;

import java.util.Arrays;
// WORKING
public class Move123Problem {

	public static void move123(int[] arr) {
		if (arr == null || arr.length == 0) { return; }
		
		int low = 0;
		int mid = 0;
		int high = arr.length-1;
		
		while(mid <= high) {
			System.out.println(Arrays.toString(arr) + ", low: " + low + ", mid: " + mid + ", high: " + high);
			if (arr[mid] == 0) {
				swap(arr, low, mid);
				low++;
			} else if (arr[mid] == 2) {
				swap(arr, high, mid);
				high--;
			} else {
				mid++;
			}
		}
	}
	
	private static void swap(int[] arr, int from, int to) {
		int temp = arr[to];
		arr[to] = arr[from];
		arr[from] = temp;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 0, 1, 0, 1 };
		System.out.println("IP: " + Arrays.toString(arr));
		move123(arr);
		System.out.println("OP: " + Arrays.toString(arr));
	}

}

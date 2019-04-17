package com.sample.arrays;

public class ArrayBinarySearch {
	
	//return index of number
	public static int arrayBinarySearch(int[] arr, int left, int right, int num) {
		int mid = (left + right) / 2;
		
		if(right < left) {
			return -1;
		}
		
		if(arr[mid] == num) {
			return mid;
		} else if(arr[mid] < num) {
			return arrayBinarySearch(arr, mid+1, right, num);
		} else {
			return arrayBinarySearch(arr, left, mid-1, num);
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		
		int num = 2;
		System.out.println("search " + num + ", index: " + arrayBinarySearch(arr, 0, arr.length, num) );

	}

}

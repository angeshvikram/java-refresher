package com.sample.arrays.rotation;

import java.util.Arrays;

public class ArrayRotationProblem {

	//Time: O(n)
	//Space: O(n) where n is size of array
	static void simpleRotation(int[] arr, int d) {
		if (arr != null && arr.length != d) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(i + ": " + arr[i]);
			}
		} else {
			System.out.println("Same");
		}
	}

	//Time: O(n * d) where n is size of array and d is number of times that array will be rotated
	//Space: O(1)
	static void leftRotate(int arr[], int d, int n) {
		for (int i = 0; i < d; i++) {
			leftRotatebyOne(arr, n);
			System.out.println("leftRotatebyOne: " + Arrays.toString(arr));
		}
	}

	static void leftRotatebyOne(int arr[], int n) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < n - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		int d = 2;

		System.out.println("arr: " + Arrays.toString(arr));
		
		simpleRotation(arr, d);
		System.out.println("Rotation: " + Arrays.toString(arr));
		
		leftRotate(arr, d, arr.length);
		System.out.println("Rotation: " + Arrays.toString(arr));

	}

}

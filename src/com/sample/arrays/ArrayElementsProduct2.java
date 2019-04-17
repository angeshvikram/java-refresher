package com.sample.arrays;

import java.util.Arrays;

public class ArrayElementsProduct2 {

	/*
	 * input:	[ 1, 2, 3, 4 ]
	 * output:	[ 1, 2, 6, 24 ]
	 * [ (1)=1, 2x1=2, 3x2x1=6, 4x3x2=24 ]
	 */
	public static int[] leftElementsProducts(int[] arr) {
		int[] leftElementsProductsArr = new int[arr.length];
		int product = 1;
		for(int i = 0; i < arr.length; i++) {
			product = product * arr[i];
			leftElementsProductsArr[i] = product;
		}
		return leftElementsProductsArr;
	}
	
	/*
	 * input:	[ 1, 2, 3, 4, 5 ]
	 * output:	[ 24, 24, 12, 4 ]
	 * [ 1x2x3x4=24, 2x3x4=24, 3x4=12, (4)=1 ]
	 */
	public static int[] rightElementsProducts(int[] arr) {
		int[] rightElementsProductsArr = new int[arr.length];
		int product = 1;
		for(int i = arr.length-1; i >=0; i--) {
			product = product * arr[i];
			rightElementsProductsArr[i] = product;
		}
		return rightElementsProductsArr;
	}
	
	/*
	 *	L: [ 1, 2, 6, 24 ]
		R: [ 24, 24, 12, 4 ]
		O: [ 24, 12, 8, 6 ]
		
		Formula left[i-1] * right[i+1]
		i=0: left[0-1] * right[0+1] = left(0) * right[1] = 1 * 24	= 24 // Tricky condition as left[0-1] = left[-1], take value of left as 1
		i=1: left[1-1] * right[1+1] = left[0] * right[2] = 1 * 12	= 12
		i=2: left[2-1] * right[2+1] = left[1] * right[3] = 2 * 4	= 8
		i=3: left[3-1] * right[3+1] = left[2] * right[4] = 6 * 1	= 6 // Tricky condition as right[3+1] = right[4] > array length, take value of right as 1 
		
		This method will return product of all elements except current element
	 */
	public static int[] getProductArray(int[] arr, int[] leftElementsProductsArr, int[] rightElementsProductsArr) {
		int[] output = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++) {
			int leftElement = i > 0 ? leftElementsProductsArr[i-1] : 1;
			int rightElement = i < arr.length-1 ? rightElementsProductsArr[i+1] : 1;
			
			int product = leftElement * rightElement;
			output[i] = product;
		}
		return output;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4 }; // [ 24, 12, 8, 6 ]
		System.out.println("Array: " + Arrays.toString(arr) );
		int[] leftElementsProductsArr = leftElementsProducts(arr);
		int[] rightElementsProductsArr = rightElementsProducts(arr);
		
		System.out.println("leftElementsProductsArr: " + Arrays.toString(leftElementsProductsArr) );
		System.out.println("rightElementsProductsArr: " + Arrays.toString(rightElementsProductsArr) );
		
		int[] output = getProductArray(arr, leftElementsProductsArr, rightElementsProductsArr);
		
		System.out.println("output: " + Arrays.toString(output) );
	}

}

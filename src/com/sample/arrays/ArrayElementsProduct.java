package com.sample.arrays;

import java.util.Arrays;

public class ArrayElementsProduct {

	/*
	 * input:	[ 1, 2, 3, 4, 5 ]
	 * output:	[ 1, 2, 6, 24, 120]
	 * [ (1)=1, 2x1=2, 3x2=6, 4x6=24, 5x24=120 ]
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
	 * output:	[ 120, 120, 60, 20, 5]
	 * [ 1x2x3x4x5=120, 2x3x4x5=120, 3x4x5=60, 4x5=20, (5)=5 ]
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
	 *	L: [1, 2, 6, 24, 120]
		R: [120, 120, 60, 20, 5]
		O: [120, 60, 40, 30, 24]
		
		[ 2x3x4x5=120, 1x3x4x5=60, 1x2x4x5=40, 1x2x3x5=30, 1x2x3x4=24 ]
		
		left[i-1] * right[i+1]
		1: left[0-1] * right[0+1] = left(1) * right[1] = (1) * 120	= 120
		2: left[1-1] * right[1+1] = left[0] * right[2] = 1 * 60		= 60
		3: left[2-1] * right[2+1] = left[1] * right[3] = 2 * 20		= 40
		4: left[3-1] * right[3+1] = left[2] * right[4] = 6 * 5		= 30
		5: left[4-1] * right[4+1] = left[3] * right(5) = 24 * 1		= 24
		
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
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("Array: " + Arrays.toString(arr) );
		int[] leftElementsProductsArr = leftElementsProducts(arr);
		int[] rightElementsProductsArr = rightElementsProducts(arr);
		
		System.out.println("leftElementsProductsArr: " + Arrays.toString(leftElementsProductsArr) );
		System.out.println("rightElementsProductsArr: " + Arrays.toString(rightElementsProductsArr) );
		
		int[] output = getProductArray(arr, leftElementsProductsArr, rightElementsProductsArr);
		
		System.out.println("output: " + Arrays.toString(output) );
	}

}

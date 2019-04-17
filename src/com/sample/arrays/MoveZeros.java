package com.sample.arrays;

import java.util.Arrays;

// WORKING
public class MoveZeros {
	
	private static void moveZeros(int[] array) {
		int reverseIndex = array.length-1;
		int i = 0;
		
		while(i < reverseIndex) {
			if(array[i] == 0) {
				//swap
				int temp = array[reverseIndex];
				array[reverseIndex] = array[i];
				array[i] = temp;
				reverseIndex--;
			} else {
				i++;
			}
		}
	}
	
	static void pushZerosToEnd(int arr[], int n) 
    { 
        int count = 0;  // Count of non-zero elements 
  
        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < n; i++)  {
        	if (arr[i] != 0) {
                arr[count] = arr[i]; // here count is 
                                       // incremented
                count++;
            }
        	System.out.println("i: " + i + ", count: " + count + ", arr: " + Arrays.toString(arr));
        }
  
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) { 
            arr[count++] = 0;
        }
    } 
	
	public static void main(String[] args) {
		int[] array = {0, 0, 0, 1, 1, 1};
		array = new int[]{0, 1};
		array = new int[]{0, 1, 1};
		array = new int[]{0, 1, 0, 1};
		array = new int[]{0, 0, 0, 1};
		array = new int[]{1, 0, 1, 0, 0};
//		array = new int[]{0};
		array = new int [] {2, 0, 5, 0, 1, 3};
//		array = new int[]{0, 1, 0, 1, 0};
		System.out.println("original array: " + Arrays.toString(array));
//		moveZeros(array);
		pushZerosToEnd(array, array.length);
		System.out.println("moved zeros: " + Arrays.toString(array));
	}
	
	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}

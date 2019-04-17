package com.sample.strings;

/*
 * Print string matrix in spiral order
 * X Y A
 * M B C
 * P Q R
 * output: XYACRQPMB
 */
public class StringMatrixSpiral {

	
	public static void printSpiral(char[][] input) {
		StringBuilder builder = new StringBuilder();
		
		int rowSize = input[0].length;
		int colSize = input.length;
		int start = 0, end = 0;
		
		for(int row = 0; row < rowSize; row++) {
			char[] rowChars = input[row];
			builder.append(rowChars[row]);
		}
		
		
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

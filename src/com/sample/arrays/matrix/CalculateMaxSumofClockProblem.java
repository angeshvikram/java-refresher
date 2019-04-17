package com.sample.arrays.matrix;

public class CalculateMaxSumofClockProblem {

	/*
	 * Given a 6x6 array, find max sum of hourglass
	 */
	public static void calculateMaxSum(int[][] clockMatrix) {
	}
	
	private static void hourglassSum(int[][] arr) {
		int maxSum = Integer.MIN_VALUE;
		for(int row = 1; row < arr.length; row++) {
			for(int col = 1; col < arr[row].length; col++) {
				// check boundaries
				if((row-1 >= 0 && row+1 <= arr.length-1)
						&& (col-1 >= 0 && col+1 <= arr[row].length-1)) {
					int sum = getHourGlassSum(arr, row, col);
					if(sum > maxSum) {
						maxSum = sum;
					}
					System.out.println("-----------------");
				}
			}
		}
		System.out.println("maxSum: " + maxSum);
	}
	
	private static int getHourGlassSum(int[][] arr, int row, int col) {
		int center = -1;
		int sum = 0;
		for(int rIdx = -1; rIdx <= 1; rIdx++) {
			int r = row + rIdx;
			for(int cIdx = -1; cIdx <= 1; cIdx++) {
				int c = col + cIdx;
				if(rIdx == 0) {
					// middle row: skip left and right elements and print only middle column
					if(cIdx == 0) {
						center = arr[r][c];
						sum = sum + arr[r][c];
						System.out.print(arr[r][c] + " ");
					} else {
						System.out.print( "  ");
					}
				} else {
					// first and third row: print all columns
					sum = sum + arr[r][c];
					System.out.print(arr[r][c] + " ");
				}
			}
			System.out.println("");
		}
		System.out.println("center: " + center + ", sum: " + sum);
		return sum;
	}
	
	public static void main(String[] args) {
		int[][] clockMatrix = new int[][] {
			{ 1,  2,  3,  4,  5,  6 },
			{ 7,  8,  9, 10, 11, 12 },
			{ 13, 14, 15, 16, 17, 18 },
			{ 19, 20, 21, 22, 23, 24 },
			{ 25, 26, 27, 28, 29, 30 },
			{ 31, 32, 33, 34, 35, 36 }
		};
		
		int[][] clockMatrix2 = new int[][] {
			{ 1,  1,  1,  1,  1,  1 },
			{ 0,  0,  0,  0,  0,  0 },
			{ -1,  -1,  -1,  -1,  -1,  -1 },
			{ 0,  0,  0,  0,  0,  0 },
			{ 1,  1,  1,  1,  1,  1 },
			{ -1,  -1,  -1,  -1,  -1,  -1 },
		};
		
		hourglassSum(clockMatrix2);
	}
	
//	private static void printHourGlassStatic(int[][] clockMatrix, int row, int col) {
//		int center = -1;
//		
//		// check boundaries
//		if((row-1 >= 0 && row+1 <= clockMatrix.length-1)
//				&& (col-1 >= 0 && col+1 <= clockMatrix[row].length-1)) {
//			
//			for(int rIdx = -1; rIdx <= 1; rIdx++) {
//				int r = row + rIdx;
//				for(int cIdx = -1; cIdx <= 1; cIdx++) {
//					int c = col + cIdx;
//					if(rIdx == 0 && cIdx == 0) { center = clockMatrix[r][c]; }
////					System.out.print(clockMatrix[r][c] + "[" + r + ":" + c + "], ");
//					System.out.print(clockMatrix[r][c] + " ");
//				}
//				System.out.println("");
//			}
//		}
//		
//		System.out.println("center: " + center);
//	}
	
//	private static void printHourGlassStatic(int[][] clockMatrix, int row, int col) {
//		int center = -1;
//		
//		// check boundaries
//		if((row-1 >= 0 && row+1 <= clockMatrix.length-1)
//				&& (col-1 >= 0 && col+1 <= clockMatrix[row].length-1)) {
//			
//			// first row
//			printRow(clockMatrix, row-1, col);
//			
//			// second row
//			printRow(clockMatrix, row, col);
//			
//			// third row
//			printRow(clockMatrix, row+1, col);
//		}
//		
//		System.out.println("center: " + center);
//	}
	
//	private static void printRow(int[][] clockMatrix, int r, int col) {
//		for(int cIdx = -1; cIdx <= 1; cIdx++) {
//			int c = col + cIdx;
////			System.out.print(clockMatrix[r][c] + "[" + r + ":" + c + "], ");
//			System.out.print(clockMatrix[r][c] + " ");
//		}
//		System.out.println("");
//	}
	
//	private static void printHourGlassStatic(int[][] clockMatrix, int row, int col) {
//	int center = -1;
//	
//	// check boundaries
//	if((row-1 >= 0 && row+1 <= clockMatrix.length-1)
//			&& (col-1 >= 0 && col+1 <= clockMatrix[row].length-1)) {
//		// first row
//		int r = row-1;
//		for(int cIdx = -1; cIdx <= 1; cIdx++) {
//			int c = col + cIdx;
//			System.out.print(clockMatrix[r][c] + "[" + r + ":" + c + "], ");
//		}
//		System.out.println("");
//		
//		// second row
//		r = row;
//		for(int cIdx = -1; cIdx <= 1; cIdx++) {
//			int c = col + cIdx;
//			if(cIdx == 0) { center = clockMatrix[r][c]; }
//			System.out.print(clockMatrix[r][c] + "[" + r + ":" + c + "], ");
//		}
//		System.out.println("");
//		
//		// third row
//		r = row+1;
//		for(int cIdx = -1; cIdx <= 1; cIdx++) {
//			int c = col + cIdx;
//			System.out.print(clockMatrix[r][c] + "[" + r + ":" + c + "], ");
//		}
//		System.out.println("");
//	}
//	
//	System.out.println("center: " + center);
//}
	
//	private static void printHourGlassStatic(int[][] clockMatrix, int row, int col) {
//		int center = -1;
//		
//		// check boundaries
//		if((row-1 >= 0 && row+1 <= clockMatrix.length-1)
//				&& (col-1 >= 0 && col+1 <= clockMatrix[row].length-1)) {
//			
//			// first row
//			printRow(clockMatrix, row-1, col);
//			
//			// second row
//			printRow(clockMatrix, row, col);
//			
//			// third row
//			printRow(clockMatrix, row+1, col);
//		}
//		
//		System.out.println("center: " + center);
//	}
	
//	private static void printHourGlass(int[][] clockMatrix, int row, int col) {
//		int center = -1;
//		if(row-1 >= 0 && row+1 <= clockMatrix.length-1) {
//			for(int r = row-1, rCount = 0; r < clockMatrix.length && rCount < 3; r++, rCount++) {
//				if(col-1 >= 0 && col+1 <= clockMatrix[r].length-1) {
//					for(int c = col-1, cCount = 0; c < clockMatrix[r].length && cCount < 3; c++, cCount++) {
//						System.out.print(clockMatrix[r][c] + "[" + r + ":" + c + "], ");
//						if(rCount==1 && rCount==1) {
//							center = clockMatrix[r][c];
//						}
//					}
//				}
//				System.out.println("");
//			}
//		}
//		System.out.println("center: " + center);
//	}
}

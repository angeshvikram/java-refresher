package com.sample.arrays.matrix;

public class MatrixSpiral {
	// Function print matrix in spiral form
	static void spiralPrint(int endingRowIdx, int endingColIdx, int a[][]) {
		int i, startingRowIdx = 0, startingColIdx = 0;
		endingRowIdx = a.length;
		endingColIdx = a[0].length;
		/*
		 * k - starting row index 
		 * m - ending row index 
		 * l - starting column index
		 * n - ending column index 
		 * i - iterator
		 */

		while (startingRowIdx < endingRowIdx && startingColIdx < endingColIdx) {
			// Print the first row from the remaining rows
			for (i = startingColIdx; i < endingColIdx; ++i) {
				System.out.print(a[startingRowIdx][i] + " ");
			}
			startingRowIdx++;

			// Print the last column from the remaining columns
			for (i = startingRowIdx; i < endingRowIdx; ++i) {
				System.out.print(a[i][endingColIdx - 1] + " ");
			}
			endingColIdx--;

			// Print the last row from the remaining rows */
			if (startingRowIdx < endingRowIdx) {
				for (i = endingColIdx - 1; i >= startingColIdx; --i) {
					System.out.print(a[endingRowIdx - 1][i] + " ");
				}
				endingRowIdx--;
			}

			// Print the first column from the remaining columns */
			if (startingColIdx < endingColIdx) {
				for (i = endingRowIdx - 1; i >= startingRowIdx; --i) {
					System.out.print(a[i][startingColIdx] + " ");
				}
				startingColIdx++;
			}
		}
	}

	// driver program
	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = { 	{ 1, 2, 3, 4, 5, 6 }, 
						{ 7, 8, 9, 10, 11, 12 }, 
						{ 13, 14, 15, 16, 17, 18 }, 
						{ 110, 210, 310, 410, 510, 610 }};
		spiralPrint(R, C, a);
	}
}
package com.sample.recursion;

import java.util.Arrays;

public class NQueensProblem {

	private static int N = 4;
	
	public static boolean isSafe(int[][] board, int row, int column) {
		boolean isSafe = true;
		
		//rows
		for(int r = 0; r < board.length; r++) {
			if(board[r][column] == 1) {
				return false;
			}
		}
		
		for(int c = 0; c < board[0].length; c++) {
			if(board[row][c] == 1) {
				return false;
			}
		}
		
		//upper diagonal on left side
		for(int r = row, c = column; r >= 0 && c >= 0; r--, c--) {
			if(board[r][c] == 1) {
				return false;
			}
		}
		
		//lower diagonal
		for(int r = row, c = column; r >= board[0].length && c >= 0; r++, c--) {
			if(board[r][c] == 1) {
				return false;
			}
		}
		
		return isSafe;
	}
	
	public static void solve(int[][] board) {
		solveHelper(board, 0);
	}
	
	public static boolean solveHelper(int[][] board, int column) {
		if(column >= N) {
			System.out.println("\nSolution: ");
			printBoard(board);
			return true;
		} else {
			for(int row = 0; row < board.length; row++) {
				
				if(isSafe(board, row, column)) {
					//select
					place(board, row, column);
					
					//explore
					boolean isFinished = solveHelper(board, column + 1);
					if(isFinished) {
						return true;
					}
					
					//unselect
					remove(board, row, column);
				}
			}
		}
		return false;
	}
	
	private static void place(int[][] board, int row, int column) {
		board[row][column] = 1;
	}
	
	private static void remove(int[][] board, int row, int column) {
		board[row][column] = 0;
	}
	
	private static void printBoard(int[][] board) {
		for(int r = 0; r < board.length; r++) {
			System.out.println(Arrays.toString(board[r]));
		}
	}
	
	public static void main(String[] args) {
		int[][] board = new int[][] {
			{ 0, 0, 0, 0 },
			{ 0, 0, 0, 0 },
			{ 0, 0, 0, 0 },
			{ 0, 0, 0, 0 }
		};
		solve(board);
	}
}

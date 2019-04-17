package com.sample.arrays;

import java.util.Arrays;

public class MoveGame {

	static int[] board = new int[] { 4, 0, 1, 2 };
	static int[][] moves = new int[][] {
		{ 2, 1, 0, -1 },
		{ 2, 1, 1, 0},
//		{ 1, 1, 0, 0 }
	};
	
	public static int checkWinner(int[] board) {
		int winner = -1;
		
		if(board != null) {
			int player1Stones = board[0];
			int player2Stones = board[board.length -1];
			
			if(player2Stones == 0 && player1Stones > 0) {
				winner = 1; 
			} else if (player1Stones == 0 && player2Stones > 0) {
				winner = 2;
			} else {
				winner = player1Stones > player2Stones ? 1 : 2;
			}
		}
		
		return winner;
	}
	
	public static void grab(int[] currentBoard, int player1, int player2) {
		for(int i = 0; i < moves.length; i++) {
			int[] board = executeMove(currentBoard, i);
			System.out.println("Executed move for player: " + player1 + ", currentBoard: " + Arrays.toString(board));
			if(board != null) {
				grab(board, player2, player1);
			} else {
				System.out.println("End of game, currentBoard: " + Arrays.toString(currentBoard));
				break;
			}
		}
	}
	
	public static int[] executeMove(int[] currentBoard, int move) {
		int[] tempBoard = new int[currentBoard.length];
		
		for(int i = 0; i < currentBoard.length; i++) {
			if(currentBoard[i] + moves[move][i] > 0) {
				tempBoard[i] = currentBoard[i] + moves[move][i];
			} else {
				return null;
			}
		}
		
		return tempBoard;
	}
	
	public static void main(String[] args) {
		int[] currentBoard = new int[] { 4, 0, 1, 2 };
//		currentBoard = executeMove(currentBoard, 0);
//		System.out.println("currentBoard: " + Arrays.toString(currentBoard));
//		System.out.println(checkWinner(currentBoard));
		grab(currentBoard, 1, 2);
	}

}

package com.coding.interviewQuestions;

import java.util.Arrays;

public class NQueenUsingBackTracking {
	public static final int N = 4;

	public static void main(String[] args) {
		char[][] mat = new char[10][10];
		/*
		 * for (int i = 0; i < N; i++) { Arrays.fill(mat[i], '0'); }
		 */

		solveNQueen(mat, 0, 4);

	}

	private static boolean solveNQueen(char[][] mat, int currentRow, int totalRow) {
		if (currentRow == totalRow) { // base case for recursion
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (mat[i][j] == '1') {
						System.out.print("Q ");
					} else {
						System.out.print("- ");
					}
				}
				System.out.println();
			}

			return true;
		}

		// place queen at every square in current row and call recursion for each valid
		// movement

		for (int currentColumn = 0; currentColumn < N; currentColumn++) {
			if (isSafe(mat, currentRow, currentColumn, N)) {
				// place queen on current box
				// assuming row and col is right position
				mat[currentRow][currentColumn] = '1';

				boolean nextQeenRakhPaye = solveNQueen(mat, currentRow + 1, N);
				if (nextQeenRakhPaye) {
					return true;
				}
				// means row col is not right position that means last desicion is false
				mat[currentRow][currentColumn] = '0';// backtrack

			}
		}
		return false;
	}

	private static boolean isSafe(char[][] mat, int row, int column, int N) {
		// check point for column
		for (int iterateRowForCheckColumn = 0; iterateRowForCheckColumn < row; iterateRowForCheckColumn++) {
			if (mat[iterateRowForCheckColumn][column] == '1') {
				return false;
			}
		}
		// check for left diagonal

		int x = row;
		int y = column;

		while (x >= 0 && y >= 0) {
			if (mat[x][y] == '1') {
				return false;
			}
			x--;
			y--;
		}

		x = row;
		y = column;

		// check for right diagonal
		while (x >= 0 && y < N) {
			if (mat[x][y] == '1') {
				return false;
			}
			x--;
			y++;
		}

		return true;
	}

}

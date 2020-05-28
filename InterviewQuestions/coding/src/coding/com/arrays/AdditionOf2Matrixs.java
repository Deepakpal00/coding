package coding.com.arrays;

import java.util.Scanner;

public class AdditionOf2Matrixs {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("for first matrix");

		int firstMatrix[][] = createMatrix();

		System.out.println("for second matrix");
		int secondtMatrix[][] = createMatrix();

		int resultMatrix[][] = matrixAddition(firstMatrix, secondtMatrix);
		printMatrix(resultMatrix);

	}

	private static void printMatrix(int[][] resultMatrix) {
		for (int i = 0; i < resultMatrix.length; i++) {
			for (int j = 0; j < resultMatrix.length; j++) {
				System.out.print(resultMatrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	private static int[][] matrixAddition(int[][] firstMatrix, int[][] secondtMatrix) {

		int matrix[][] = new int[firstMatrix.length][firstMatrix.length];
		for (int i = 0; i < firstMatrix.length; i++) {
			for (int j = 0; j < firstMatrix.length; j++) {
				matrix[i][j] = firstMatrix[i][j] + secondtMatrix[i][j];
			}
		}
		return matrix;
	}

	private static int[][] createMatrix() {
		System.out.println("Enter Total Number of Row ");
		int row, column;
		row = column = scanner.nextInt();
		System.out.println("Enter elements in matrix ");
		int matrix[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = scanner.nextInt();
			}
		}
		return matrix;
	}

}

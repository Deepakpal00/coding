package coding.com.arrays;

import java.util.LinkedList;
import java.util.List;

public class FindZeroAndSetRowAndColumnZero {

	public static void main(String[] args) {
		int array[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 0 } };
		List<Integer> indexList = scanArray(array, array.length, array[0].length);
		setZeroToRow(array, array.length, array[0].length, indexList);
		setZeroToColumn(array, array.length, array[0].length, indexList);
		printMatrix(array, array.length, array[0].length);

	}

	private static void printMatrix(int[][] array, int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");

		}

	}

	private static void setZeroToRow(int[][] array, int row, int column, List<Integer> indexList) {
		for (int j = 0; j < indexList.size(); j += 2) {
			int index = indexList.get(j);
			for (int i = 0; i < column; i++) {
				array[index][i] = 0;
			}
		}
	}

	private static void setZeroToColumn(int[][] array, int row, int column, List<Integer> indexList) {
		for (int j = 1; j < indexList.size(); j += 2) {
			int index = indexList.get(j);
			for (int i = 0; i < column; i++) {
				array[i][index] = 0;
			}
		}
	}

	private static List<Integer> scanArray(int[][] array, int row, int column) {
		List<Integer> indexMaintainList = new LinkedList<Integer>();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (array[i][j] == 0) {
					indexMaintainList.add(i);
					indexMaintainList.add(j);
				}
			}

		}
		return indexMaintainList;

	}

}

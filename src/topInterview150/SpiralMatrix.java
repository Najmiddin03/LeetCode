package topInterview150;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

//	Given an m x n matrix, return all elements of the matrix in spiral order.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> records = new ArrayList<>();
		int rowStart = 0;
		int colStart = 0;
		int rowEnd = matrix[0].length - 1;
		int colEnd = matrix.length - 1;

		while (colStart <= colEnd && rowStart <= rowEnd) {
			// Row traversal
			for (int i = rowStart; i <= rowEnd; i++) {
				records.add(matrix[colStart][i]);
			}
			colStart++;
			// Column traversal
			if (colStart > colEnd)
				break;
			for (int j = colStart; j <= colEnd; j++) {
				records.add(matrix[j][rowEnd]);
			}
			rowEnd--;
			// Reverse row traversal
			if (rowStart > rowEnd)
				break;
			for (int k = rowEnd; k >= rowStart; k--) {
				records.add(matrix[colEnd][k]);
			}
			colEnd--;
			// Reverse column traversal
			if (colStart > colEnd)
				break;
			for (int m = colEnd; m >= colStart; m--) {
				records.add(matrix[m][rowStart]);
			}
			rowStart++;
			if (rowStart > rowEnd)
				break;
		}
		return records;
	}

}

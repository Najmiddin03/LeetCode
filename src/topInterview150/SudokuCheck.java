package topInterview150;

import java.util.HashSet;

public class SudokuCheck {

//	Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
//	Each row must contain the digits 1-9 without repetition.
//	Each column must contain the digits 1-9 without repetition.
//	Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
//	Note:
//	A Sudoku board (partially filled) could be valid but is not necessarily solvable.
//	Only the filled cells need to be validated according to the mentioned rules.

	public static void main(String[] args) {
	}

	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			if (!checkRow(i, board))
				return false;
		}

		for (int i = 0; i < board[0].length; i++) {
			if (!checkCol(i, board))
				return false;
		}

		for (int i = 0; i < board.length; i += 3) {
			for (int j = 0; j < board[i].length; j += 3) {
				if (!checkGrid(i, j, board))
					return false;
			}
		}
		return true;
	}

	private boolean checkRow(int row, char[][] board) {
		var set = new HashSet<Character>();
		for (int col = 0; col < board[row].length; col++) {
			if (board[row][col] == '.')
				continue;
			if (!set.add(board[row][col]))
				return false;
		}
		return true;
	}

	private boolean checkCol(int col, char[][] board) {
		var set = new HashSet<Character>();
		for (int row = 0; row < board.length; row++) {
			if (board[row][col] == '.')
				continue;
			if (!set.add(board[row][col]))
				return false;
		}
		return true;
	}

	private boolean checkGrid(int row, int col, char[][] board) {
		var set = new HashSet<Character>();
		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				if (board[i][j] == '.')
					continue;
				if (!set.add(board[i][j]))
					return false;
			}
		}
		return true;
	}

}

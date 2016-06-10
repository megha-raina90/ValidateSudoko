package com.cts.sudukoValidator;
import java.util.Arrays;

public class SudukoValidation {

	public boolean checkSudokuStatus(char[][] grid) {

		for (int i = 0; i < 9; i++) {

			char[] row = new char[9];
			char[] square = new char[9];
			char[] column = grid[i].clone();

			for (int j = 0; j < 9; j++) {
				row[j] = grid[j][i];
				square[j] = grid[(i / 3) * 3 + j / 3][i * 3 % 9 + j % 3];
			}
			if (!(validate(column) && validate(row) && validate(square)))
				return false;
		}
		return true;
	}

	public boolean validate(char[] column) {
		int i = 0;
		Arrays.sort(column);
		
		for (char number : column) {
			
			int temp = Character.getNumericValue(number);
			if (temp != ++i)
				return false;
		}
		return true;
	}



}

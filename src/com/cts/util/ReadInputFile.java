package com.cts.util;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.cts.sudukoValidator.SudukoValidation;

public class ReadInputFile {

	public void ReadSudokoSolutionFile(File file) throws IOException {
		SudukoValidation sv = new SudukoValidation();
		BufferedReader br = new BufferedReader(new FileReader(file));
		char sudokuMatrix[][] = new char[9][9];
		String line = null;
		int i = 0;

		while ((line = br.readLine()) != null) {
			char fileLineToArray[] = line.toCharArray();
			while (i <= 9) {
				System.arraycopy(fileLineToArray, 0, sudokuMatrix[i], 0, 9);
				i++;
				break;
			}

		}

		br.close();
		boolean IsSudokoSolValid=sv.checkSudokuStatus(sudokuMatrix);
		System.out.println(IsSudokoSolValid);

		
	}


}

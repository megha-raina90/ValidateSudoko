import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadInputFile {

	private void ReadSudokoSolutionFile(File file) throws IOException {
		SudukoValidation sv = new SudukoValidation();
		BufferedReader br = new BufferedReader(new FileReader(file));
		char sMatrix[][] = new char[9][9];
		String line = null;
		int i = 0;

		while ((line = br.readLine()) != null) {
			char arr[] = line.toCharArray();
			while (i <= 9) {
				System.arraycopy(arr, 0, sMatrix[i], 0, 9);
				i++;
				break;
			}

		}

		br.close();
		boolean IsSudokoSolValid=sv.checkSudokuStatus(sMatrix);
		System.out.println(IsSudokoSolValid);

		// return false;
	}

	public static void main(String[] args) {

		
		 // can create a config class where usr can provide the path  of the suduko solution  file to be read; Hard Coding for time being 
		
		ReadInputFile rf = new ReadInputFile();
		try {
			rf.ReadSudokoSolutionFile(new File("/Users/muneendrabhardwaj/Downloads/input_sudoku.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

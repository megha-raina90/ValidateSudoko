package com.cts.execute;

import java.io.File;
import java.io.IOException;
import com.cts.sudukoValidator.*;
import com.cts.util.ReadFilePath;
import com.cts.util.ReadInputFile;

public class Executor {

	public static void main(String[] args) {

		// can create a config class where usr can provide the path of the
		// suduko solution file to be read; Hard Coding for time being

		ReadInputFile rf = new ReadInputFile();
		try {
			rf.ReadSudokoSolutionFile(new File(new ReadFilePath().readPath()));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

package com.cts.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadFilePath {

	public String readPath(){
	Properties prop = new Properties();
	InputStream input = null;
	String path=null;
	try {

		input = new FileInputStream("config/FilePath.properties");

		// load a properties file
		prop.load(input);

		// get the property value and print it out
		 path =prop.getProperty("path");
		System.out.println("Solution File stored at "+ prop.getProperty("path"));
		
	} catch (IOException ex) {
		ex.printStackTrace();
	} finally {
		if (input != null) {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	return path;

	
	
}
}

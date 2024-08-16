package com.stackroute.exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileEdition {

	// Write here logic to append the given content in the given file name
	public String fileEditor(String fileName, String content) {

		String readFromContent = "";
		String appendString = "";

		if (content == null || content.isEmpty() || content.isBlank()) {
			return "Given content to add is empty,null or blank space";
		}

		if (!(fileName.equals("test.txt"))) {
			return String.format("File '%s' not Found", fileName);
		}

		try {
			FileInputStream fis = new FileInputStream(fileName);
			int character;

			while ((character = fis.read()) != -1) {

				readFromContent = readFromContent + (char) character;

			}

			appendString = readFromContent + "" + content;

			FileWriter fw = new FileWriter(fileName, true);
			fw.write(content);
			fw.close();
			fis.close();
		} catch (FileNotFoundException e) {
			return String.format("File '%s' not Found", fileName);
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		return appendString;
	}

}

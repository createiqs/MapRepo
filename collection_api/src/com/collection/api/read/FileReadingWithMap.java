package com.collection.api.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileReadingWithMap {

	static final String PATH = "C:\\test\\readData.txt";

	public static Map<String, Integer> readFile() {
		Map<String, Integer> mapContent = new HashMap<String, Integer>();
		BufferedReader br = null;

		try {
			File file = new File(PATH);
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				// split the line by line
				String[] parts = line.split(":");
				String name = parts[0].trim();
				Integer age = Integer.parseInt(parts[1].trim());
				if (!name.equals("") && !age.equals("")) {
					mapContent.put(name, age);
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}

		return mapContent;

	}

	public static void main(String[] args) {
		Map<String, Integer> readFile = readFile();
		for (String object : readFile.keySet()) {
			System.out.println(object + " " + readFile.get(object));
		}

	}

}

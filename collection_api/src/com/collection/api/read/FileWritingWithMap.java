package com.collection.api.read;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FileWritingWithMap {

	public static void main(String[] args) {
		Map<String, Integer> mapContent = new HashMap<>();
		mapContent.put("Kalyan", 25);
		mapContent.put("Rohit", 32);
		mapContent.put("Virat", 31);
		mapContent.put("Mithali", 36);

		BufferedWriter br = null;
		try {
			br = new BufferedWriter(new FileWriter("data.txt"));
			for (Map.Entry<String, Integer> entry : mapContent.entrySet()) {
				br.write(entry.getKey() + ":" + entry.getValue());
				br.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

}

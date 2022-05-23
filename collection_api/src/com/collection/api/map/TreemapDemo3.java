package com.collection.api.map;

import java.util.Hashtable;
import java.util.TreeMap;

public class TreemapDemo3 {

	public static void main(String[] args) {

		TreeMap<String, String> contacts = new TreeMap<>();
		contacts.put("1245365", "Ramu");
		contacts.put("9848612", "Rahim");
		contacts.put("9966144", "Akbar");
		contacts.put("3256472", "Antony");
		System.out.println(contacts);

		TreeMap<String, String> httpErrors = new TreeMap<>();
		httpErrors.put("100", "Continue");
		httpErrors.put("200", "OK");
		httpErrors.put("303", "See Other");
		httpErrors.put("300", "Multiple Choices");
		httpErrors.put("404", "Not Found");
		httpErrors.put("500", "Internal Server");
		httpErrors.put("400", "Bad Request");
		httpErrors.put("401", "Unauthorized");
		httpErrors.put("402", "Payment Required");
		httpErrors.put("403", "Forbidden");
		httpErrors.put("501", "Not Implemented");
		httpErrors.put("502", "Bad Gateway");

		System.out.println(httpErrors);

		Hashtable<String, String> hashTable = new Hashtable<>();
		hashTable.put("1245365", "Ramu");
		hashTable.put("9848612", "Rahim");
		hashTable.put("9966144", "Akbar");
		hashTable.put("3256472", "Antony");
//		hashTable.put(null, null);
		System.out.println(hashTable);

		TreeMap<String, String> domains = new TreeMap<>();
		domains.put(".com", "International");
		domains.put(".us", "Unitedstates");
		domains.put(".uk", "United Kingdom");
		domains.put(".au", "Australia");
		domains.put(".jp", "Japan");
		domains.put(".eu", "European Union");
		domains.put("501", "Not Implemented");
		domains.put("100", "Continue");
	}

}

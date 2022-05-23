package com.collection.api.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
//		lowerKey(K key): returns the greatest key strictly less than the given key.
//		floorKey(K key): returns the greatest key less than or equal to the given key.
//		ceilingKey(K key): returns the least key greater than or equal to the given key.
//		higherKey(K key): returns the least key strictly greater than the given key.
//		descendingKeySet(): returns a NavigableSet containing the keys in reverse order.

//		TreeMap<String, String> contacts = new TreeMap<>();
//		contacts.put("1245365", "Ramu");
//		contacts.put("9848612", "Rahim");
//		contacts.put("9966144", "Akbar");
//		contacts.put("3256472", "Antony");
//		System.out.println(contacts);

		TreeMap<String, String> httpStatusCodes = new TreeMap<>();
		httpStatusCodes.put("100", "Continue");
		httpStatusCodes.put("200", "OK");
		httpStatusCodes.put("303", "See Other");
		httpStatusCodes.put("300", "Multiple Choices");
		httpStatusCodes.put("404", "Not Found");
		httpStatusCodes.put("500", "Internal Server");
		httpStatusCodes.put("400", "Bad Request");
		httpStatusCodes.put("401", "Unauthorized");
		httpStatusCodes.put("402", "Payment Required");
		httpStatusCodes.put("403", "Forbidden");
		httpStatusCodes.put("501", "Not Implemented");
		httpStatusCodes.put("502", "Bad Gateway");

//		System.out.println(httpErrors);
		NavigableMap<String, String> descendingKeySetNav = httpStatusCodes.descendingMap();
		for (String httpStatusCode : descendingKeySetNav.keySet()) {
			System.out.println("HTTPSTATUSCODE " + httpStatusCode + " " + descendingKeySetNav.get(httpStatusCode));
		}

		Set<String> ascendingKeys = httpStatusCodes.keySet();

		System.out.println("Ascending Keys: " + ascendingKeys);

		Set<String> descendingKeys = httpStatusCodes.descendingKeySet();

		System.out.println("Descending Keys: " + descendingKeys);

		String lowerKey = httpStatusCodes.lowerKey("401");
		System.out.println("Lower key: " + lowerKey);

		String floorKey = httpStatusCodes.floorKey("401");
		System.out.println("Floor key: " + floorKey);

		String higherKey = httpStatusCodes.higherKey("500");
		System.out.println("Higher key: " + higherKey);

		String ceilingKey = httpStatusCodes.ceilingKey("500");
		System.out.println("Ceiling key: " + ceilingKey);

		Map.Entry<String, String> firstEntry = httpStatusCodes.firstEntry();

		System.out.println("First entry: " + firstEntry.getKey() + " => " + firstEntry.getValue());

		Map.Entry<String, String> lastEntry = httpStatusCodes.lastEntry();

		System.out.println("Last entry: " + lastEntry.getKey() + " => " + lastEntry.getValue());

		Map.Entry<String, String> lowerEntry = httpStatusCodes.lowerEntry("401");
		System.out.println("Lower entry: " + lowerEntry.getKey() + " => " + lowerEntry.getValue());

		Map.Entry<String, String> floorEntry = httpStatusCodes.floorEntry("401");
		System.out.println("Floor entry: " + floorEntry.getKey() + " => " + floorEntry.getValue());

		Map.Entry<String, String> higherEntry = httpStatusCodes.higherEntry("500");
		System.out.println("Higher entry: " + higherEntry.getKey() + " => " + higherEntry.getValue());

		Map.Entry<String, String> ceilingEntry = httpStatusCodes.ceilingEntry("500");
		System.out.println("Ceiling entry: " + ceilingEntry.getKey() + " => " + ceilingEntry.getValue());

		httpStatusCodes.pollFirstEntry();
		httpStatusCodes.pollLastEntry();

		System.out.println("\nMap after first and last entries were polled:");

		for (String key : httpStatusCodes.keySet()) {
			System.out.println(key + " => " + httpStatusCodes.get(key));
		}
	}

}

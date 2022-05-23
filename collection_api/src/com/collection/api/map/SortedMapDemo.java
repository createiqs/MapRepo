package com.collection.api.map;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {
		SortedMap<Integer, String> mapHttpStatus = new TreeMap<>();

		mapHttpStatus.put(100, "Continue");
		mapHttpStatus.put(200, "OK");
		mapHttpStatus.put(300, "Multiple Choices");

		mapHttpStatus.put(400, "Bad Request");
		mapHttpStatus.put(401, "Unauthorized");
		mapHttpStatus.put(402, "Payment Required");
		mapHttpStatus.put(403, "Forbidden");
		mapHttpStatus.put(404, "Not Found");

		mapHttpStatus.put(500, "Internal Server Error");
		mapHttpStatus.put(501, "Not Implemented");
		mapHttpStatus.put(502, "Bad Gateway");

		System.out.println("All key-value pairs: ");

		for (Integer code : mapHttpStatus.keySet()) {
			System.out.println(code + " -> " + mapHttpStatus.get(code));
		}

		System.out.println();

		Integer firstKey = mapHttpStatus.firstKey();
		String firstValue = mapHttpStatus.get(firstKey);

		System.out.println("First status: " + firstKey + " -> " + firstValue);
		System.out.println();

		Integer lastKey = mapHttpStatus.lastKey();
		String lastValue = mapHttpStatus.get(lastKey);

		System.out.println("Last status: " + lastKey + " -> " + lastValue);
		System.out.println();

		SortedMap<Integer, String> map4xxStatus = mapHttpStatus.subMap(400, 500);

		System.out.println("4xx Statuses: ");

		for (Integer code : map4xxStatus.keySet()) {
			System.out.println(code + " -> " + map4xxStatus.get(code));
		}

		System.out.println();

		SortedMap<Integer, String> mapUnder300Status = mapHttpStatus.headMap(300);

		System.out.println("Statuses < 300: ");

		for (Integer code : mapUnder300Status.keySet()) {
			System.out.println(code + " -> " + mapUnder300Status.get(code));
		}

		System.out.println();

		SortedMap<Integer, String> mapAbove500Status = mapHttpStatus.tailMap(500);

		System.out.println("Statuses > 500: ");

		for (Integer code : mapAbove500Status.keySet()) {
			System.out.println(code + " -> " + mapAbove500Status.get(code));
		}

		Comparator comparator = mapHttpStatus.comparator();

		System.out.println("Sorted by natural ordering? " + (comparator == null));

		SortedMap<Integer, String> httpStatusCodes = new TreeMap<>(new ReverseComparator());

		httpStatusCodes.put(100, "Continue");
		httpStatusCodes.put(200, "OK");
		httpStatusCodes.put(300, "Multiple Choices");

		httpStatusCodes.put(400, "Bad Request");
		httpStatusCodes.put(401, "Unauthorized");
		httpStatusCodes.put(402, "Payment Required");
		httpStatusCodes.put(403, "Forbidden");
		httpStatusCodes.put(404, "Not Found");

		httpStatusCodes.put(500, "Internal Server Error");
		httpStatusCodes.put(501, "Not Implemented");
		httpStatusCodes.put(502, "Bad Gateway");

		for (Integer code : httpStatusCodes.keySet()) {
			System.out.println(code + " -> " + httpStatusCodes.get(code));
		}
	}

}

class ReverseComparator implements Comparator<Integer> {
	public int compare(Integer num1, Integer num2) {
		return num2.compareTo(num1);
	}
}

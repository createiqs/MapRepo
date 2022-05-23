package com.collection.api.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, String> categories = new LinkedHashMap<>();
		categories.put("Programming Language", "This Categories contains programming language");
		categories.put("General Knowledge", "This Categories contains GK");
		categories.put("Politics", "This Categories contains Politics");

		System.out.println("------------------------------------0");
		for (Map.Entry<String, String> entry : categories.entrySet()) {
			System.out.println("Key " + entry.getKey() + " value: " + entry.getValue());
		}

		System.out.println("------------------------------------1");
		Iterator<Entry<String, String>> itr = categories.entrySet().iterator();
//		Map.Entry<String, String> entry = itr.next();
//		System.out.println("Key " + entry.getKey() + " value: " + entry.getValue());
		while (itr.hasNext()) {
			Map.Entry<String, String> entry = itr.next();
			System.out.println("Key " + entry.getKey() + " value: " + entry.getValue());
		}
		System.out.println("------------------------------------2");

		categories.entrySet().stream()
				.forEach(e -> System.out.println("Key " + e.getKey() + " value: " + e.getValue()));

		System.out.println("------------------------------------3");
		Set<Entry<String, String>> entrySet = categories.entrySet();

		for (Entry<String, String> entry : entrySet) {
			System.out.println("Key " + entry.getKey() + " value: " + entry.getValue());

		}

		System.out.println("------------------------------------4");
		Iterator<String> iterator = categories.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println("Key: " + key + " value: " + categories.get(key));
		}
	}
}

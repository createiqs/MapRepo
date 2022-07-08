package com.collection.api.mapex;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MapDemo {

	public static void main(String[] args) {

		// key unique , basic for// country names and codes or capitals

		Map<String, String> countries = new HashMap<String, String>();

		System.out.println(countries.isEmpty());// true
		System.out.println(countries.size());
//		System.out.println(countries);
		countries.put("India", "New Delhi");
		countries.put("England", "London");
		countries.put("Russia", "Moscow");
		countries.put("Australia", "Sidney");
		countries.put("China", "Beezing");
		countries.put(null, null);
		countries.put("India", "Mumbai");

		System.out.println(countries.isEmpty());// false
		System.out.println(countries.size()); // 5

//		System.out.println(countries);

		for (Entry<String, String> entry : countries.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}

		System.out.println(" ------------------------------------------------");

		Collection<String> values = countries.values();
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);

		}

		System.out.println(" ------------------------------------------------");
		Iterator<Entry<String, String>> iterator = countries.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entries = iterator.next();
			System.out.println(entries.getKey() + " " + entries.getValue());
		}

		System.out.println(" ------------------------------------------------");

		countries.entrySet().stream().forEach(c -> System.out.println(c.getKey() + " " + c.getValue()));

		String input = "Dubai";
//		if(countries.containsValue(input)) {
//			System.out.println(countries);
//		}else {
//			System.out.println(" there is no vlaue is present in the map");
//		}

//		if (countries.containsValue(input)) {
//			System.out.println(countries);
//		} else {
//			countries.put("United Arab", input);
//		}
//		
//		System.out.println(countries);

		if (countries.containsValue(input)) {
			System.out.println(countries);
		} else {
			countries.putIfAbsent("United Arab", input);
		}
		System.out.println(countries);
		Set<Student> students = new TreeSet<>();

//		Set<Student> students = new TreeSet<>(new Comparator<Student>() {
//
//			@Override
//			public int compare(Student s1, Student s2) {
//				return s1.getName().compareTo(s2.getName());
//			}
//		});

		students.add(new Student(1002, "balu"));
		students.add(new Student(1001, "raji"));
		students.add(new Student(1000, "anil"));
		System.out.println(students);
	}

}

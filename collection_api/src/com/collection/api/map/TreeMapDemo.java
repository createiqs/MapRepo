package com.collection.api.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<String, Double> fruits = new TreeMap<>();
		fruits.put("WaterMillon", 60.00);
		fruits.put("Mango", 120.00);
		fruits.put("Banana", 40.00);
		fruits.put("Apple", 280.00);
		fruits.put("Oranges", 80.00);

//		for (String fruit : fruits.keySet()) {
//			System.out.println(fruit + " " + fruits.get(fruit));
//		}
		System.out.println("------------------------------------0");
		System.out.println("First product in the tree map: " + fruits.firstKey());
		System.out.println("------------------------------------1");

		System.out.println("Last product in the tree map: " + fruits.lastKey());
		System.out.println("------------------------------------2");
		for (String fruit : fruits.keySet()) {
			System.out.println(fruit + " ₹ " + fruits.get(fruit));
		}
		System.out.println("------------------------------------3");
		for (String fruit : fruits.descendingKeySet()) {
			System.out.println(fruit + " ₹ " + fruits.get(fruit));
		}
		System.out.println("------------------------------------4");
		NavigableMap<String, Double> descendingMap = fruits.descendingMap();
		for (String fruit : descendingMap.keySet()) {
			System.out.println(fruit + " ₹ " + descendingMap.get(fruit));
		}
		System.out.println("------------------------------------5");
		System.out.println("Lower key: " + fruits.lowerKey("Winter"));
		System.out.println("Floor key: " + fruits.floorKey("Spring"));
		System.out.println("higer key: " + fruits.higherKey(" summer"));
		System.out.println("ceeling key: " + fruits.ceilingKey("Spring"));
	}

}

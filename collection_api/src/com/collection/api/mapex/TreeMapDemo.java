package com.collection.api.mapex;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<String, Double> fruits = new TreeMap<>();

		fruits.put("Mango", 180.00);
		fruits.put("Orange", 160.00);
		fruits.put("Apple", 250.00);
		fruits.put("Bananna", 50.00);
		fruits.put("Grapes", 150.00);
//		fruits.put(null, null);

		System.out.println(fruits);

		System.out.println("fruits: ");
		for (String fruit : fruits.keySet()) {
			System.out.println("fruit Name: " + fruit + " price: " + fruits.get(fruit));
		}
		
//		System.out.println("-----------------------");
//		System.out.println(fruits.lowerEntry("Apple"));
//		System.out.println(fruits.floorEntry("Bananna"));
		
//		System.out.println(" desceding order");
//		for (String fruit : fruits.descendingKeySet()) {
//			System.out.println("fruit Name: " + fruit + " price: " + fruits.get(fruit));
//		}
		
		System.out.println(fruits.tailMap("Bananna"));
		System.out.println(fruits.headMap("Grapes"));
	}

}

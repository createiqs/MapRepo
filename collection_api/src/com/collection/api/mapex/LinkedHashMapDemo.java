package com.collection.api.mapex;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Double> fruits = new LinkedHashMap<>();
		fruits.put("Mango", 180.00);
		fruits.put("Orange", 160.00);
		fruits.put("Apple", 250.00);
		fruits.put("Bananna", 50.00);
		fruits.put("Grapes", 150.00);
		fruits.put(null, null);

		System.out.println(fruits);

		System.out.println("fruits: ");
		for (String fruit : fruits.keySet()) {
			System.out.println("fruit Name: " + fruit + " price: " + fruits.get(fruit));
		}

		LinkedHashMap<String, Double> products = new LinkedHashMap<>();
		products.put("amul butter", 95.00);
		products.put("Dabur Honey", 125.00);
		products.put("rawa", 55.00);
		products.put("daal", 195.00);
		products.put("closue up paste", 75.00);

		System.out.println("products: ");
		for (String product : products.keySet()) {
			System.out.println("product Name: " + product + " price: " + products.get(product));
		}

		// bulk operations ----> groceries
		LinkedHashMap<String, Double> grociers = new LinkedHashMap<>(fruits);
		grociers.putAll(products);

		System.out.println("groceries: ");
		for (String product : grociers.keySet()) {
			System.out.println("product Name: " + product + " price: " + grociers.get(product));
		}

	}

}

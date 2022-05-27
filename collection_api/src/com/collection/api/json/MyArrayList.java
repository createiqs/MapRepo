package com.collection.api.json;

import java.util.Arrays;

public class MyArrayList {

	private int size;
	private Object[] elements;

	public MyArrayList() {

		this.elements = new Object[10];
		size = 0;
	}

	public void add(Object obj) {
		if (size >= elements.length) {
			Object[] newElement = new Object[size + 10];
			for (int i = 0; i < size; ++i)
				newElement[i] = elements[i];
		}

		elements[size] = obj;
		++size;

	}

	public int size() {
		return size;
	}

	public Object get(int index) {
		if (index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
		}
		return elements[index];

	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
	}

	public static void main(String[] args) {
		MyArrayList array = new MyArrayList();

		array.add("anil");
		array.add("raju");

		System.out.println(array);
		Integer j = 0;
		for (int i = 0; i < array.size(); ++i) {
			String object = (String) array.get(i);
			System.out.println(object);
		}

		array.add(12345);
		String str = (String) array.get(2);
//		Integer str=(Integer) array.get(2);
		System.out.println(str);

	}

}

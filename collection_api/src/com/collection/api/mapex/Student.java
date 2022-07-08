package com.collection.api.mapex;

import java.util.Arrays;

public class Student implements Comparable<Student>{

	private int id;
	private String name;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

//		int[] numbers = { 5, 3, 4, 1, 2 };
//		Arrays.sort(numbers);
//		System.out.println(Arrays.toString(numbers));

		Student s1 = new Student(1001, "anil");
		Student s2 = new Student(1000, "balu");

		Student[] students = { s1, s2 };
		Arrays.sort(students);
		System.out.println(Arrays.toString(students));

	}
	// output 1. 1000, 2.1001

	@Override
	public int compareTo(Student o) {
		return this.getId()-o.getId();
	}

}

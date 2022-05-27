package com.collection.api.json;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class EmployeeTest {

	public static void ReadJsonData(File fileName) {

		try {

			ObjectMapper objectMapper = new ObjectMapper();
//			objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//			Employee employee = objectMapper.readValue(fileName, Employee.class);
			Employee employee = objectMapper.readValue(new FileInputStream(fileName), Employee.class);
			System.out.println(employee.getName());
			System.out.println(employee.getAddress());
			System.out.println(employee);

		} catch (JsonProcessingException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void writeObjectToJson(File file) throws JsonGenerationException, JsonMappingException, IOException {
		Address address = new Address("Street", "123");
		List<String> skilltree = new ArrayList<>();
		skilltree.add("Java");
		skilltree.add("Python");
		skilltree.add("Java Script");
		Employee employee = new Employee("David", POSITION.SOFTWARE_ENGINEER, skilltree, address);
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(file, employee);
		String output = mapper.writeValueAsString(employee);
		System.out.println(output);
	}

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		File file = new File("employee.json");
		ReadJsonData(file);
//		writeObjectToJson(file);

	}

}

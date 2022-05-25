package com.collection.api.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {

		Department deptHR = new Department(100, "HR", "Hyd");
		Department deptIT = new Department(101, "IT", "Hyd");
		Department deptHR2 = new Department(102, "HR", "Pune");
		Department deptIT2 = new Department(103, "IT", "Chennai");

		Employee admin = new Employee(10, "anil", 155000.00, deptIT);
		Employee lead = new Employee(10, "anil", 155000.00, deptIT);
		Employee Manager = new Employee(10, "anil", 155000.00, deptIT);
		Employee developer = new Employee(10, "anil", 155000.00, deptIT);
		Employee sd = new Employee(10, "anil", 155000.00, deptIT);
		Employee recruiter = new Employee(11, "rakesh", 60000.00, deptHR);
		Employee hr = new Employee(12, "mahesh", 85000.00, deptHR);
		Employee recruiter2 = new Employee(13, "sachin", 65000.00, deptHR2);
		Employee hr2 = new Employee(14, "usha", 75000.00, deptHR2);
		Employee developer2 = new Employee(15, "vinnu", 35000.00, deptIT2);
		Employee developer3 = new Employee(16, "radha", 25000.00, deptIT2);
		Employee sd2 = new Employee(17, "balu", 66000.00, deptIT);

		List<Employee> employees = new ArrayList<Employee>();
		employees.add(Manager);
		employees.add(hr);
		employees.add(recruiter);
		employees.add(hr2);
		employees.add(recruiter2);
		employees.add(admin);
		employees.add(lead);
		employees.add(sd);
		employees.add(sd2);
		employees.add(developer);
		employees.add(developer2);
		employees.add(developer3);
//		case 1	
//		Iterator<Employee> itr = employees.iterator();
//		while (itr.hasNext()) {
//			Employee employee = itr.next();
//			if (employee.getDepartment().getDeptName().equals("IT")) {
//				System.out.println(employee);
//			}
//		}

//		case 2
		Iterator<Employee> itr2 = employees.iterator();
		while (itr2.hasNext()) {
			Employee employee = itr2.next();
			if (employee.getDepartment().getDeptName().equals("HR")
					&& (employee.getDepartment().getLocation().equals("Pune"))) {
				System.out.println(employee);
			}
		}

//		case 3
		// find who's salary is between 75k to 1Lac
		for (Employee employee : employees) {

			if ((employee.getSal() > 75000.00) && employee.getSal() < 100000.00) {
				System.out.println(employee);
			}
		}

		// like that you can search the data according to our requirement
	}

}

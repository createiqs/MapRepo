package com.collection.api.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class EmployeeMapTest {

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

		Map<Employee, String> employees = new HashMap<>();
		employees.put(recruiter, " Hr Recruiter");
		employees.put(recruiter2, "Hr Recruiter from Pune");
		employees.put(Manager, " It Manager");
		employees.put(admin, "Technical Admin");
		employees.put(lead, "Technical Lead");
		employees.put(sd, "Senior Developer");
		employees.put(developer, " Developer");
		employees.put(hr, "Hr Administration");
		employees.put(hr2, "Hr Administration FRom Pune");
		employees.put(sd2, "Senior Developer");
		employees.put(developer2, " Developer");
		employees.put(developer3, " Developer ");

//		for (Employee employee : employees.keySet()) {
//			if (employee.getDepartment().getLocation().equals("Pune")) {
//				System.out.println(employee);
//			}
//		}

		// OR you can write same code in number of ways as per requirement

		List<Employee> emps = new ArrayList<Employee>();
		emps.add(Manager);
		emps.add(admin);
		emps.add(lead);
		emps.add(sd);
		emps.add(developer);

		List<Employee> recruiters = new ArrayList<Employee>();
		recruiters.add(recruiter2);
		recruiters.add(recruiter);

		List<Employee> hrs = new ArrayList<Employee>();
		hrs.add(hr);
		hrs.add(hr2);
		List<Employee> devs = new ArrayList<Employee>();
		hrs.add(developer2);
		hrs.add(developer3);

		Map<Integer, List<Employee>> employees2 = new HashMap<>();

		employees2.put(1, emps);
		employees2.put(2, recruiters);
		employees2.put(3, hrs);
		employees2.put(4, devs);

		Iterator<Entry<Integer, List<Employee>>> iterator = employees2.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, List<Employee>> entry = iterator.next();
			List<Employee> list = entry.getValue();
			for (Employee emp : list) {
				if (emp.getDepartment().getDeptName().equals("HR")) {
					System.out.println(emp);
				}
			}

		}

//		Collection<List<Employee>> values = employees2.values();
//		Iterator<List<Employee>> iterator2 = values.iterator();

	}
}

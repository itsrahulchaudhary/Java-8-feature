package com.java8feature.parallelStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDatabasePS {

	public static List<Employee> getEmployees() {

		List<Employee> employees = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			employees.add(new Employee(i, "employee " + i, "A", Double.valueOf(new Random().nextInt(100 * 1000))));
		}
		return employees;
	}

}

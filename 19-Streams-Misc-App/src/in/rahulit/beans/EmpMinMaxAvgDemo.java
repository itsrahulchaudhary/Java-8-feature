package in.rahulit.beans;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpMinMaxAvgDemo {
	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Ram", 23, 90000));
		list.add(new Employee("Ashok", 25, 60000));
		list.add(new Employee("Suresh", 33, 25000));
		list.add(new Employee("Charan", 26, 40000));

		Double avgSalary = list.stream().collect(Collectors.averagingInt(emp -> emp.getSalary()));
		System.out.println("Emp Avg Salary :: " + avgSalary);

		Optional<Employee> minEmpSalary = list.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Minimum Salary Emp:: " + minEmpSalary.get());

		Optional<Employee> maxEmpSalary = list.stream()
				.collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println("Maximum Salary Emp:: " + maxEmpSalary.get());

	}
}

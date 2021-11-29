package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsToListDemo {

	public static void printEmpName(List<String> empNames) {
		System.out.println(empNames);
	}

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("Ram", 23, 50000));
		list.add(new Employee("Ashok", 23, 32000));
		list.add(new Employee("Suresh", 23, 20000));
		list.add(new Employee("Charan", 23, 40000));
		list.add(new Employee("Balram", 23, 47000));

		List<String> empNames = list.stream().map(e -> e.getName()).collect(Collectors.toList());
		printEmpName(empNames);
	}
}

package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;

public class MatchingDemo {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		list.add(new Person("David", 23, "India"));
		list.add(new Person("Joy", 25, "USA"));
		list.add(new Person("Ryan", 50, "Canada"));
		list.add(new Person("Ram", 45, "India"));
		list.add(new Person("Ching", 56, "China"));

		//boolean isIndianAvailable = list.stream().anyMatch(p -> p.getCountry().equals("India"));
		//System.out.println("Is Indian available in Collection :: " + isIndianAvailable);

		//boolean allMatch = list.stream().allMatch(p -> p.getCountry().equals("India"));
		//System.out.println("All persons are indians or not :: " + allMatch);
		
		 boolean noneMatch = list.stream().noneMatch(p -> p.getCountry().equals("France"));
		 System.out.println("No France people are available :: "+noneMatch);
	}

}

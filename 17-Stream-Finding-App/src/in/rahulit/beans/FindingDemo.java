package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
 
public class FindingDemo {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<Person>();
		list.add(new Person("David", 23, "India"));
		list.add(new Person("Joy", 25, "USA"));
		list.add(new Person("Ryan", 50, "Canada"));
		list.add(new Person("Ram", 45, "India"));
		list.add(new Person("Ching", 56, "China"));

		Optional<Person> findFirst = list.stream().filter(p -> p.getCountry().equals("India")).findFirst();
		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}

		Optional<Person> findAny = list.stream().filter(p -> p.getCountry().equals("India")).findAny();
		if (findAny.isPresent()) {
			System.out.println(findAny.get());
		}
	}

}

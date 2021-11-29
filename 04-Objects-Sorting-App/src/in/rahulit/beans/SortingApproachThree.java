package in.rahulit.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingApproachThree {

	public static void main(String[] args) {
		Person p1 = new Person(101, "Nick", "nick@ashokit.in");
		Person p2 = new Person(103, "Orlen", "orlen@ashokit.in");
		Person p3 = new Person(102, "John", "john@ashokit.in");
		Person p4 = new Person(104, "Charles", "charles@ashokit.in");
		List<Person> persons = Arrays.asList(p1, p2, p3, p4);

		System.out.println("=========== Object Before Sorting ==========");
		for (Person p : persons) {
			System.out.println(p);
		}

		// Sorting logic
		Collections.sort(persons, (o1, o2) -> o1.getPname().compareTo(o2.getPname()));

		System.out.println("=========== Object After Sorting ==========");
		for (Person p : persons) {
			System.out.println(p);
		}
	}

}

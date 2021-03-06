package in.rahulit.beans;

import java.util.Arrays;
import java.util.List;

public class PersonsFilters {

	public static void main(String[] args) {
		Person p1 = new Person("Raju", 28, "Software");
		Person p2 = new Person("Mahesh", 29, "Driver");
		Person p3 = new Person("Sanjay", 30, "Teacher");
		Person p4 = new Person("Sunil", 27, "Mechanic");
		Person p5 = new Person("Bharat", 30, "Chef");

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		persons.stream().filter(p -> p.getAge() > 18 && p.getAge() < 30 && p.getJob().equals("Software"))
				.forEach(System.out::println);

	}

}

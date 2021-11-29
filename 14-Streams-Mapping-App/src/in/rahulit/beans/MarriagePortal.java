package in.rahulit.beans;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MarriagePortal {

	public static void main(String[] args) {
		Person p1 = new Person("Raju", "Software", 6301921083l);
		Person p2 = new Person("Gopi", "Chef", 789767899l);
		Person p3 = new Person("Mahesh", "PhotoGrapher", 668621083l);
		Person p4 = new Person("Sunil", "Driver", 47575721083l);
		Person p5 = new Person("David", "Teacher", 5678921083l);
		Person p6 = new Person("Ashok", "Software", 630192178l);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

		// Give me person name with number who is doing Software job

		Stream<Person> stream = persons.stream();
		stream.filter(person -> person.getJob().equals("Software"))
		.map(name -> name.getName() + "::" + name.getPhno())
		.forEach(System.out::println);
		
	}

}

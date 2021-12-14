package in.rahulit.beans;

import java.util.Arrays;

import java.util.List;
import java.util.function.Predicate;
/*
 *  Write a java program to print person names who are eligible for vote from below 
 *  persons using Lambda
 */
public class PersonNamesPrint {

	public static void main(String[] args) {

		Person p1 = new Person("Raju", 21);
		Person p2 = new Person("Chetan", 23);
		Person p3 = new Person("Anil", 14);
		Person p4 = new Person("Gita", 24);
		Person p5 = new Person("Suchitra", 26);

		List<Person> persons = Arrays.asList(p1, p2, p3, p4, p5);
		Predicate<Person> predicate = (p) -> p.getAge() >= 18;

		for (Person person : persons) {
			boolean isEligible = predicate.test(person);
			if (isEligible) {
				System.out.println(person.getName());
			}
		}

	}

}

package in.rahulit.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingApproachOne {
	
	public static void main(String[] args) {

		Person p1 = new Person(101, "Nick", "nick@rahulit.in");
		Person p2 = new Person(103, "Orlen", "orlen@rahulit.in");
		Person p3 = new Person(102, "John", "john@rahulit.in");
		Person p4 = new Person(104, "Charles", "charles@rahulit.in");
		List<Person> persons = Arrays.asList(p1,p2,p3,p4);
		
		System.out.println("=========== Object Before Sorting ==========");
		for(Person p : persons) {
			System.out.println(p);
		}
		
		// Sorting logic
		Collections.sort(persons, new PersonComparator());
		System.out.println("=========== Object After Sorting ==========");
		for(Person p : persons) {
			System.out.println(p);
		}
	}

}
class PersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
 		return o1.getPname().compareTo(o2.getPname());
	}
	
}

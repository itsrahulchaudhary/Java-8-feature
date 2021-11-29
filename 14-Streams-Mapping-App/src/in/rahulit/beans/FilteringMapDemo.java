package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilteringMapDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Anushka");
		list.add("TriSha");
		list.add("Nayanatara");
		list.add("Deepika Padukone");
		list.add("Pooja Hegde");
		list.add("Anupama Parameswaran");
		list.add("Amisha Patel");

		Stream<String> stream = list.stream();

		// Print Heroine name with length whose name is starting with A

		stream.filter(name -> name.startsWith("A"))
		      .map(name -> name + "::" + name.length())
		      .forEach(System.out::println);

	}

}

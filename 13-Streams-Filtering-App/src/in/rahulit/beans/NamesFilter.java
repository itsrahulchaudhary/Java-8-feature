package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NamesFilter {

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
		// stream.filter(n -> n.startsWith("A")).forEach(System.out::println);
		stream.filter(n -> n.startsWith("A")).forEach(n -> System.out.println(n));

	}

}

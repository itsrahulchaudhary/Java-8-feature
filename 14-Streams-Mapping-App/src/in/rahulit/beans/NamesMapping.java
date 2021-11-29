package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;

public class NamesMapping {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Anushka");
		list.add("TriSha");
		list.add("Nayanatara");
		list.add("Deepika Padukone");
		list.add("Pooja Hegde");
		list.add("Anupama Parameswaran");
		list.add("Amisha Patel");

		list.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
	}

}

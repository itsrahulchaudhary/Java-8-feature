package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NamesLength {

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
		
		//Stream<String> tfstream = stream.map(name -> name.toUpperCase() + "::" + name.length());
		IntStream tfstream = stream.mapToInt(name -> name.length());
		
		tfstream.forEach(System.out::println);
	}

}

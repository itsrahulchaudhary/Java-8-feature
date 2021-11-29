package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;

public class SlicingDemo {

	public static void main(String[] args) {
		List<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("China");
		countries.add("UK");
		countries.add("India");
		countries.add("USA");

		//Getting unique value from collection using distinct()
		//countries.stream().distinct().forEach(System.out::println);
		
		//Getting specific records from collection using limit()
		//countries.stream().limit(3).forEach(System.out::println);
		
		//Removing first N no. of records.
		countries.stream().skip(2).forEach(System.out::println);
		
		
	}
}

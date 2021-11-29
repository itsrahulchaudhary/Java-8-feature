package in.rahulit.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
public class CollectorsToMapDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Sachin");
		list.add("Dhoni");
		list.add("Rohit");

		Map<String, Integer> namesMap = list.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
		System.out.println(namesMap);
	}

}

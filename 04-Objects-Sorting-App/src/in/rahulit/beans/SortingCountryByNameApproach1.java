package in.rahulit.beans;
import java.util.Map;
import java.util.TreeMap;

public class SortingCountryByNameApproach1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "USA");
		map.put(91, "India");
		map.put(61, "Australia");
		map.put(92, "Pakistan");
		map.put(86, "China");
		map.put(33, "France");

		System.out.println("======= Sorting Before Map ======");
		for (Map.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getValue());
		}
		
        // Approach-1
		/*
		Map<Integer, String> sortMap = new TreeMap<Integer, String>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		});
		*/
		
        // Approach-2 (Using Lambda Expression)
		Map<Integer, String> sortMap = new TreeMap<Integer, String>((o1, o2) -> o2.compareTo(o1));
		sortMap.putAll(map);
		
		System.out.println("======= Sorting After Map ======");
		for (Map.Entry<Integer, String> m : sortMap.entrySet()) {
			System.out.println(m.getValue());
		}

	}

}

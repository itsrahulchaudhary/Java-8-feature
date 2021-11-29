package in.rahulit.beans;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/*
 *  Write a java program to print person names who are eligible for vote from below 
 *  persons using Lambda
 */
public class NameVoteCheck {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Raju", 20);
		map.put("Nick", 10);
		map.put("Rani", 21);
		map.put("Sita", 21);

		Predicate<Integer> predicate = (age) -> age > 18;
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			if (predicate.test(m.getValue())) {
				System.out.println(m.getKey());
			}
		}

	}

}

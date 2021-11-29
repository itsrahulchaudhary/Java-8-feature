package in.rahulit.beans;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingCountryByNameApproach2 {

	public static void main(String[] args) {
		Country c1 = new Country(1, "USA");
		Country c2 = new Country(91, "India");
		Country c3 = new Country(61, "Australia");
		Country c4 = new Country(92, "Pakistan");
		Country c5 = new Country(86, "China");
		Country c6 = new Country(33, "France");

		List<Country> countrys = Arrays.asList(c1, c2, c3, c4, c5, c6);

		System.out.println("=========== Object Before Sorting ==========");
		for (Country c : countrys) {
			System.out.println(c);
		}
		Collections.sort(countrys, (o1, o2) -> o1.getCountryName().compareTo(o2.getCountryName()));
		System.out.println("=========== Object After Sorting ==========");
		for (Country c : countrys) {
			System.out.println(c);
		}
		
	}

}

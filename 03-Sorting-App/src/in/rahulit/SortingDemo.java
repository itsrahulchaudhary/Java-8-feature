package in.rahulit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {

		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(5);
		al.add(15);
		al.add(30);
		al.add(2);

		System.out.println("Element Before Sorting:: " + al);
		
		//Approach - 1 (Implementing Comparator Interface)
		//Collections.sort(al, new ElementsSortingComparator());
		
		//Approach - 2 (Anonymous Implementation for Comparator)
		/*
		Collections.sort(al, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0; 
			}
		});
		*/
		
		//Approach - 3 (Using Lambdas)
		Collections.sort(al, (o1, o2) -> {
			return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0;
		});
		
		System.out.println("Element After Sorting :: "+ al);

	}

}

class ElementsSortingComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
	/*	
		if (o1 > o2)
			return 1;
		else if (o1 < o2)
			return -1;
		else
			return 0;
	*/
	return (o1 > o2) ? 1 : (o1 < o2) ? -1 : 0; 
	}
}

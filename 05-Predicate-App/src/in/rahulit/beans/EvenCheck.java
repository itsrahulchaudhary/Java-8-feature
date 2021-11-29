package in.rahulit.beans;

import java.util.function.Predicate;

public class EvenCheck {

	public static void main(String[] args) {

		Predicate<Integer> predicate = i -> i % 2 == 0;
		boolean status = isEven(predicate, 11);
		System.out.println(status);

	}

	public static boolean isEven(Predicate<Integer> predicate, Integer i) {
		//return predicate.test(i);
		return predicate.negate().test(i); // reverse the condition	
	}

}

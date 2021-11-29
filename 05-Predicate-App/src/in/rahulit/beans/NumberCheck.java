package in.rahulit.beans;

import java.util.function.Predicate;

/*
 *  Check weather given number is greather than 20 or not.
 */

public class NumberCheck {

	public static void main(String[] args) {
		// Logic wihtout Lambda
		NumberCheck num = new NumberCheck();
		System.out.println(num.test(28));

		// Logic with Lambda & Predicate
		Predicate<Integer> predicate = (number) -> number > 20;
		System.out.println(predicate.test(26));
	}

	public boolean test(int number) {
		if (number > 20) {
			return true;
		} else {
			return false;
		}
	}
}

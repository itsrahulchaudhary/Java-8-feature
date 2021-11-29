package in.rahulit.beans;

import java.util.function.Predicate;

/*
 * Write a program to check person name is having 7 characters not. 
 * If name having 7 or more characters return true otherwise return false.
 */
public class NameLengthCheck {
	public static void main(String[] args) {
		Predicate<String> predicate = (name) -> name.length() > 7;
		System.out.println(predicate.test("rahul kkkkk"));

	}
}

package in.rahulit.beans;

import java.util.function.Predicate;

/*
 * Write a program to print names which are starting with character 'A' using lambda 
 *  from below names.
 */
public class NamesPrinting {
 	public static void main(String[] args) {
		String[] names = { "Kajal", "Samantha", "Anushka", "Trisha", "Anupama", 
				"Nayanthara", "Aishwarya" };
		
		Predicate<String> predicate=(name)->name.startsWith("A");
		
		for(String name:names) {
			if(predicate.test(name)) {
				System.out.println(name);
			}
		}

	}

}

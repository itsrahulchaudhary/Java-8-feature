package in.rahulit.beans;

import java.time.LocalDate;
import java.time.Month;

public class Demo1 {

	public static void main(String[] args) {

		// Getting Current Date
		LocalDate now = LocalDate.now();
		System.out.println(now);

		// Getting specific date using of method
		LocalDate date = LocalDate.of(2020, 05, 20);
		System.out.println(date);

		date = LocalDate.of(2021, Month.MAY, 20);
		System.out.println(date);

		// Converting String to Date using Parse
		date = LocalDate.parse("2015-02-26");
		System.out.println(date);

		// Adding 4 days to given date
		date = date.plusDays(4);
		System.out.println(date);

		// Adding 4 months to given date
		date = date.plusMonths(4);
		System.out.println(date);

		// Check date is before given date
		boolean isBefore = LocalDate.parse("2020-03-12").isBefore(LocalDate.parse("2018-06-14"));
		System.out.println(isBefore);
		
		// Check date is after given date
		boolean isAfter = LocalDate.parse("2020-03-12").isAfter(LocalDate.parse("2018-06-14"));
		System.out.println(isAfter);
	}
}

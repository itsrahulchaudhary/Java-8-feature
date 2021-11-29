package in.rahul.it;

import java.util.Date;
import java.util.function.Supplier;

public class DateApp {

	public static void main(String[] args) {

		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}

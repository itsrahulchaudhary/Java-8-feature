package in.rahulit.beans;

import java.time.LocalTime;

public class Demo2 {

	public static void main(String[] args) {
		// Getting current Time
		LocalTime time = LocalTime.now();
		System.out.println(time);

		// Getting Specific Time using of method
		time = LocalTime.of(11, 20, 03);
		System.out.println(time);

		// Convert String value to Date using parse method
		time = LocalTime.parse("08:30:20");
		System.out.println(time);
		
		//Adding 4 seconds to given time
		time = time.plusSeconds(4);
		System.out.println(time);
		
		//Adding minutes to given time
		time = time.plusMinutes(10);
		System.out.println(time);
		
		//Adding hour to given time
		time = time.plusHours(2);
		System.out.println(time);
	}
}

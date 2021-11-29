package in.rahulit.beans;

public class M04WellWisher {

	// Scenario-3: (Using Lambda Expressions) way-2

	public static void main(String[] args) {
		Greeting hindi = () -> System.out.println("Hello, Good Morning..!!");
		hindi.greet();

		Greeting english = () -> System.out.println("Namaskar..!!");
		english.greet();

	}

}

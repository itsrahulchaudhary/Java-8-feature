package in.rahulit.beans;

public class M03WellWisher {

	// Scenario-3: (Using Lambda Expressions) way-1
	
	public static void wish(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {
		wish(() -> System.out.println("Hello, Good Morning..!!"));
	}

}

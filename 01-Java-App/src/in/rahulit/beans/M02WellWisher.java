package in.rahulit.beans;

public class M02WellWisher {
	
	// Scenario-2: (Anonymous Implementation for Interface)

	public static void wish(Greeting greeting) {
		greeting.greet();
	}

	public static void main(String[] args) {
		wish(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Hello, Good Morning...!!");
			}
		});

		wish(new Greeting() {
			@Override
			public void greet() {
				System.out.println("Namasta..!!");
			}
		});
	}
}

package in.rahulit.beans;

public class M01WellWisher {
	
	// Scenario-1: (Implementation classes for Interface)
	 
	public static void wish(Greeting greeting) {
		greeting.greet();
	}
	
	public static void main(String[] args) {
		Greeting hindi = new HindiGreeting();
		hindi.greet();
		
		Greeting english = new EnglishGreeting();
		english.greet();
	}
	

}

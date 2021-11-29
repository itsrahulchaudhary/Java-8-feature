package in.rahulit.beans;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args) {
		BiConsumer<String, String> bi = (arg1, arg2) -> {
			System.out.println("Hi i am , " + arg1);
			System.out.println("I am from , " + arg2);
		};
		bi.accept("Rahul", "Balrampur");
	}

}

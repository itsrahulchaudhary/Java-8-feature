package in.rahulit.beans;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consume1 = (name) -> System.out.println(name + " Good Mrong...!!!");
		consume1.accept("Rahul");

		Consumer<Integer> consume2 = (i) -> System.out.println(i * i);
		consume2.accept(20);
	}
}

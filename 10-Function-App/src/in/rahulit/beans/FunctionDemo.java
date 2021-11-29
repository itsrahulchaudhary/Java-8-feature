package in.rahulit.beans;

import java.util.function.Function;
import java.util.function.BiFunction;

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, String> f1 = (s) -> s.toUpperCase();
		System.out.println(f1.apply("Rahul"));

		Function<Integer, Integer> f2 = (i) -> i * i;
		System.out.println(f2.apply(10));
		
		BiFunction<Integer, Integer, Integer> f3 = (i, j) -> (i * j);
		System.out.println(f3.apply(10, 20));
	}

}

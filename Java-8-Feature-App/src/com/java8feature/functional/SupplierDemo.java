package com.java8feature.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Hi Rahul !!!";
		System.out.println(supplier.get());

		List<String> list = Arrays.asList("a", "b");
		//System.out.println(list.stream().findAny().orElseGet(supplier));

		System.out.println(list.stream().findAny().orElseGet(() -> "Hi Rahul !!!"));

	}

}

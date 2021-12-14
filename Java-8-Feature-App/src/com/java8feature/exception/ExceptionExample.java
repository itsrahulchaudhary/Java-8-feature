package com.java8feature.exception;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("23", "45", "zz");
		List<Integer> list2 = Arrays.asList(1,0);
		List<Integer> list3 = Arrays.asList(10,20);
		
		// Approach-1
		// list.forEach(t->System.out.println(Integer.parseInt(t)));
		
		// Approach-2
	/*	list.forEach(t -> {
			try {
				System.out.println(Integer.parseInt(t));
			} catch (Exception e) {
				System.out.println("Exception :: " + e.getMessage());
			}
		});*/
		
		// Approach-3
		//list.forEach(ExceptionExample::print);
		
		// Approach-4
		//list.forEach(handleExceptionIfAny(t->System.out.println(Integer.parseInt(t))));

		// Approach-5
		//list.forEach(handleGenericException(t -> System.out.println(Integer.parseInt(t)), NumberFormatException.class));

		//list2.forEach(handleGenericException(t -> System.out.println(10 / t), ArithmeticException.class));
		
		
		list3.forEach(handleCheckedExceptionConsumer(i -> {
			Thread.sleep(i);
			System.out.println(i);
		}));
	}
	
	public static void print(String t) {
		try {
			System.out.println(Integer.parseInt(t));
		} catch (Exception e) {
			System.out.println("Exception :: " + e.getMessage());
		}
	}
	
	public static Consumer<String> handleExceptionIfAny(Consumer<String> payload){
		return obj->{
			try {
				payload.accept(obj);
			}catch(Exception e) {
				System.out.println("Exception :: " + e.getMessage());
			}
		};
	}
	
	public static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(
			Consumer<Target> targetConsumer, Class<ExObj> exObjClass) {
		return obj -> {
			try {
				targetConsumer.accept(obj);
			} catch (Exception ex) {
				try {
					ExObj exObj = exObjClass.cast(ex);
					System.out.println("Exception :: " + exObj.getMessage());
				} catch (ClassCastException cce) {
					throw ex;
				}
			}
		};
	}
	
	public static <Target> Consumer<Target> handleCheckedExceptionConsumer(
			CheckedExceptionHandlerConsumer<Target, Exception> handlerConsumer) {
		return obj -> {
			try {
				handlerConsumer.accept(obj);
			} catch (Exception ex) {
				throw new RuntimeException(ex);
			}
		};
	}

}

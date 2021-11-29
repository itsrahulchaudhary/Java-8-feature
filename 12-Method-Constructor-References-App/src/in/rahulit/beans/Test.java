package in.rahulit.beans;

public class Test {

	public static void m2() {
		System.out.println("This is m2 () method...");
	}

	public static void main(String[] args) {
		//MyInterface mi = () -> System.out.println("Hi, i am from m1() method");
		MyInterface mi = Test::m2;
		mi.m1();
	}
}

@FunctionalInterface
interface MyInterface {
	public void m1();
}
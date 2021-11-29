package in.rahulit.beans;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {

	public static void main(String[] args) {
		
		Callable callable = new Callable() {
			@Override
			public Object call() throws Exception {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
				return null;
			}
		};
		
		Callable callable1=	()->{
			for(int i=100; i<=110; i++) {
				System.out.println(i);
			}
			return null;
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(callable1);
	}

}

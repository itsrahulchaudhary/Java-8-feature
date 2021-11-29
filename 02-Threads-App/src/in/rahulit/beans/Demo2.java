package in.rahulit.beans;

public class Demo2 {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 1; i <= 10; i++) {
					System.out.println(i);
				}
			}
		};

		Thread t = new Thread(runnable);
		t.start();
	}

}

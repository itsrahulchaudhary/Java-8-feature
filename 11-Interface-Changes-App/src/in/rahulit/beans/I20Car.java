package in.rahulit.beans;

public class I20Car implements Vehicle {

	@Override
	public void cleanVehicle() {
		System.out.println("I20 Car is getting clean...");
	}

	@Override
	public void sensor() {
		System.out.println("sensor() method is overridden ::");
	}
	
}

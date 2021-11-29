package in.rahulit.beans;

public interface Vehicle {

	void cleanVehicle();

	default void startVehicle() {
		System.out.println("Vehicle is started...");
	}

	default void sensor() {
		System.out.println("Sensor Added...");
	}
	
	static void fuelCheck() {
		System.out.println("Checking Fuel...");
	}
}

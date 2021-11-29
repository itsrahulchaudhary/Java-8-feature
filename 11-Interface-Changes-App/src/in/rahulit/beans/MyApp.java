package in.rahulit.beans;

public class MyApp {
	public static void main(String[] args) {
		Vehicle vehicle = new I20Car();
		vehicle.cleanVehicle();
		vehicle.startVehicle();
		vehicle.sensor();
		Vehicle.fuelCheck();

		System.out.println("======================================");

		Vehicle veh = new Creta();
		veh.cleanVehicle();
		veh.startVehicle();
		veh.sensor();
		Vehicle.fuelCheck();
	}
}

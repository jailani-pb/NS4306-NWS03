package ch02;

public class Car {

	String colour;
	int noOfDoors;
	int gasMileage;
	int currentSpeed;
	int totalMileage;
	static int noOfCars;
	
	public void pressAccelerator(int speed) {
		String msg = "Sudah ku takan";
		System.out.println(msg);
		currentSpeed += speed;
		gasMileage -= 5;
		totalMileage += 5;
	}
	
	public void pressBrake() {
		currentSpeed = 0;
	}
	
}

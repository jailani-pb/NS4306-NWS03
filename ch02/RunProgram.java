package ch02;

public class RunProgram {

	public static void main(String[] args) {
		Car firstCar = new Car();
		firstCar.colour = "Blue";
		firstCar.noOfDoors = 5;
		firstCar.gasMileage = 500;
		firstCar.currentSpeed = 0;
		firstCar.totalMileage = 100;
		
		System.out.println("Initial Speed for firstCar");
		System.out.println(firstCar.currentSpeed);
		
		System.out.println("Pressing Accelerator for firstCar");
		firstCar.pressAccelerator(10);
		System.out.println("Current Speed (firstCar): " 
				+ firstCar.currentSpeed);
		System.out.println("Pressing Accelerator for firstCar");
		firstCar.pressAccelerator(20);
		System.out.println("Current Speed (firstCar): " 
				+ firstCar.currentSpeed);
		
		System.out.println("Pressing Brake for firstCar");
		firstCar.pressBrake();
		System.out.println("Current Speed (firstCar): " 
				+ firstCar.currentSpeed);
		System.out.println("Gas Mileage (firstCar): " 
				+ firstCar.gasMileage);
		System.out.println("Total Mileage (firstCar): " 
				+ firstCar.totalMileage);
		
		Car secondCar = new Car();
		secondCar.colour = "White";
		secondCar.noOfDoors = 5;
		secondCar.gasMileage = 200;
		secondCar.currentSpeed = 0;
		secondCar.totalMileage = 10000;
		
		System.out.println("Pressing Accelerator for secondCar");
		secondCar.pressAccelerator(30);
		System.out.println("Current Speed (firstCar): " 
				+ firstCar.currentSpeed);
		System.out.println("Current Speed (secondCar): " 
				+ secondCar.currentSpeed);
		
		secondCar.noOfCars = 2;
		System.out.println("No of Cars Created");
		System.out.println("noOfCars (firstCar): " 
				+ firstCar.noOfCars);
		System.out.println("noOfCars (secondCar): " 
				+ secondCar.noOfCars);
	}

}

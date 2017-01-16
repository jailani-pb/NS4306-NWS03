package ch02;

public class RunProgram {

	public static void main(String[] args) {
		System.out.println("Current noOfCars: " + Car.getNoOfCars());
		Car firstCar = new Car("Blue", 5, 500, 0 , 100);
		
		System.out.println("Initial Speed for firstCar");
		System.out.println(firstCar.currentSpeed);
		
		System.out.println("Pressing Accelerator for firstCar");
		System.out.println(firstCar.pressAccelerator(10));
		System.out.println("Current Speed (firstCar): " 
				+ firstCar.currentSpeed);
		System.out.println("Pressing Accelerator for firstCar");
		System.out.println(firstCar.pressAccelerator(20));
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
		
		Car secondCar = new Car("White", 5, 200, 0, 10000);
		
		System.out.println("Pressing Accelerator for secondCar");
		System.out.println(secondCar.pressAccelerator(30));
		System.out.println("Current Speed (firstCar): " 
				+ firstCar.currentSpeed);
		System.out.println("Current Speed (secondCar): " 
				+ secondCar.currentSpeed);
		
		Car thirdCar = new Car();
		
		System.out.println("No of Cars Created");
		System.out.println("noOfCars (firstCar): " 
				+ firstCar.noOfCars);
		System.out.println("noOfCars (secondCar): " 
				+ secondCar.noOfCars);
	}

}

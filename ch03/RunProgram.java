package ch03;

public class RunProgram {

	public static void main(String[] args) {
		Car car1 = new Truck("BeepBoop!", 4, 100);
		System.out.println(car1.colour);
		System.out.println(car1.pressAccelerator(100));
		System.out.println(((Truck) car1).pressHorn());
		System.out.println(car1.pressBrake());
		System.out.println(car1.pressBrake());
		System.out.println(car1.pressBrake());
		
		car1 = new SuperCar(true);
		System.out.println(car1.colour);
		System.out.println(car1.pressAccelerator(100));
		System.out.println(car1.pressBrake());
		System.out.println(car1.pressBrake());
		System.out.println(car1.pressBrake());
		
	}

}

package ch03;

public class SuperCar extends Car{

	boolean turbo;
	
	public SuperCar(boolean turbo) {
		super();
		this.turbo = turbo;
	}
	
	public String pressAccelerator(int speed) {
		if(turbo == true) {
			currentSpeed += speed*2;
		} else {
			currentSpeed += speed;
		}
		return "Accelerator is pressed. CurrentSpeed: " + currentSpeed;
	}
	
}

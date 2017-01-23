package ch03;

public class Truck extends Car {

	String hornSound;
	
	public Truck() {
		this("Beep!");
	}
	
	public Truck(String hornSound) {
		super(1000, 10, 10000);
		this.hornSound = hornSound;
	}
	
	public String pressHorn() {
		String msg = "Horn is Pressed with sound ";
		return msg + hornSound;
	}
	
	public String pressBrake() {
		if(currentSpeed > 10) {
			currentSpeed -= 10;
		} else {
			currentSpeed = 0;
		}
		return "Brake is pressed. CurrentSpeed: " + currentSpeed;
	}
}

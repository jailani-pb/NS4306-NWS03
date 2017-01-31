package ch03;

public class SuperCar extends Car implements BringPassenger {

	boolean turbo;
	private int noOfPassenger;
	
	public SuperCar(boolean turbo) {
		super();
		this.turbo = turbo;
		this.noOfPassenger = 0;
	}
	
	public String pressAccelerator(int speed) {
		if(turbo == true) {
			int currentSpeed = getCurrentSpeed();
			currentSpeed += speed*2;
			setCurrentSpeed(currentSpeed);
		} else {
			int currentSpeed = getCurrentSpeed();
			currentSpeed += speed;
			setCurrentSpeed(currentSpeed);
		}
		return "Accelerator is pressed. CurrentSpeed: " + getCurrentSpeed();
	}

	@Override
	public String turnSteering() {
		return "Turning the steering wheel.";
	}

	@Override
	public String bringPassenger() {
		if(noOfPassenger == 1) {
			return "This SuperCar cannot fit more than 1 passenger. Current noOfPassenger = " + noOfPassenger;
		} else {
			noOfPassenger = 1;
			return "Welcome to my SuperCar, Passenger. Current noOfPassenger = " + noOfPassenger;
		}
	}

	@Override
	public String leavePassenger() {
		if(noOfPassenger == 0) {
			return "There is no passenger in this SuperCar. Current noOfPassenger = " + noOfPassenger;
		} else {
			noOfPassenger = 0;
			return "Sad to see you go, Passenger. Current noOfPassenger = " + noOfPassenger;
		}
	}
	
}

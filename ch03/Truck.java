package ch03;

public class Truck extends Car implements ItemLoading, BringPassenger {

	String hornSound;
	private int loadCapacity;
	private int maxCapacity;
	private int noOfPassenger;
	private int maxPassenger;
	
	public Truck(int maxCapacity, int maxPassenger) {
		this("Beep!", maxCapacity, maxPassenger);
	}
	
	public Truck(String hornSound, int maxCapacity, int maxPassenger) {
		super(1000, 10, 10000);
		this.hornSound = hornSound;
		this.maxCapacity = maxCapacity;
		this.maxPassenger = maxPassenger;
	}
	
	public String pressHorn() {
		String msg = "Horn is Pressed with sound ";
		return msg + hornSound;
	}
	
	public String pressBrake() {
		int currentSpeed = getCurrentSpeed();
		currentSpeed -= 10;
		setCurrentSpeed(currentSpeed);
		return "Brake is pressed. CurrentSpeed: " + getCurrentSpeed();
	}

	public String turnSteering() {
		if(getCurrentSpeed() >= 80) {
			return "You're too fast. " + pressBrake();
		} else {
			return "Turning the steering wheel.";
		}
	}

	@Override
	public String loadItem(int weight) {
		if((loadCapacity+weight) > maxCapacity) {
			return "The Truck cannot fit more than " + maxCapacity + " items weight. Current loadCapacity = " + loadCapacity;
		} else {
			loadCapacity += weight;
			return "The Truck have loaded item with weight = " + weight + ". Current loadCapacity = " + loadCapacity;
		}
	}

	@Override
	public String unloadItem(int weight) {
		if((loadCapacity-weight) < 0) {
			return "The Truck cannot unload " + weight + " items weight. Current loadCapacity = " + loadCapacity;
		} else {
			loadCapacity -= weight;
			return "The Truck have unloaded item with weight = " + weight + ". Current loadCapacity = " + loadCapacity;
		}
	}

	@Override
	public String bringPassenger() {
		if(noOfPassenger >= maxPassenger) {
			return "This Truck cannot fit more than " + maxPassenger + " passenger. Current noOfPassenger = " + noOfPassenger;
		} else {
			noOfPassenger++;
			return "Welcome to my Truck, Passenger. Current noOfPassenger = " + noOfPassenger;
		}
	}

	@Override
	public String leavePassenger() {
		if(noOfPassenger <= 0) {
			return "There is no passenger in this Truck. Current noOfPassenger = " + noOfPassenger;
		} else {
			noOfPassenger--;
			return "Sad to see you go, Passenger. Current noOfPassenger = " + noOfPassenger;
		}
	}
}

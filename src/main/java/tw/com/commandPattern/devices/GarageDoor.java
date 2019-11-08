package tw.com.commandPattern.devices;

public class GarageDoor {
	private String location;
	
	public GarageDoor(String location) {
		super();
		this.location = location;
	}

	public void up() {
		System.out.println(this.location + "Garage Door up.");
	}
	
	public void down() {
		System.out.println(this.location + "Garage Door down.");
	}
	
	public void stop() {
		System.out.println(this.location + "Garage Door stop.");
	}
	
	public void lightUp() {
		System.out.println(this.location + "Garage Door light up.");
	}
	
	public void lightOff() {
		System.out.println(this.location + "Garage Door light off.");
	}
}

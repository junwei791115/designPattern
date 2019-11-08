package tw.com.commandPattern.devices;

public class CeilingFan {
	
	private String location;

	public CeilingFan(String location) {
		super();
		this.location = location;
	}

	public void high() {
		System.out.println(this.location + "Ceiling fan on.");
	}
	
	public void medium() {
		System.out.println(this.location + "Ceiling fan medium.");
	}
	
	public void low() {
		System.out.println(this.location + "Ceiling fan low.");
	}
	
	public void off() {
		System.out.println(this.location + "Ceiling fan off.");
	}
	
	public void getSpeed() {
		System.out.println(this.location + "Get ceiling fan speed.");
	}
}

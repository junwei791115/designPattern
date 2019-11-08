package tw.com.commandPattern.devices;

public class Light {
	
	private String location;

	public Light(String location) {
		super();
		this.location = location;
	}

	public void on() {
		System.out.println(this.location + "light on.");
	}
	
	public void off() {
		System.out.println(this.location +" light off.");
	}
}

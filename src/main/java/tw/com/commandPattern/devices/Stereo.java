package tw.com.commandPattern.devices;

public class Stereo {
	String location;

	public Stereo(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(this.location +" stereo on.");
	}
	
	public void off() {
		System.out.println(this.location +" stereo off.");
	}
	
	public void setCd() {
		System.out.println(this.location +" stereo set CD.");
	}
	
	public void setDvd() {
		System.out.println(this.location +" stereo set DVD.");
	}
	
	public void setRadio() {
		System.out.println(this.location +" stereo set radio.");
	}
	
	public void setVolume(int volume) {
		System.out.println(this.location +" stereo set volume : "+ volume +".");
	}
}

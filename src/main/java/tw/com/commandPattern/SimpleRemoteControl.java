package tw.com.commandPattern;

public class SimpleRemoteControl {
	
	private Command command;
	
	public SimpleRemoteControl() {
		
	}

	public void setSlot(Command command) {
		this.command = command;
	}
	
	public void buttonWasPressed() {
		command.execute();
	}
}

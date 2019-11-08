package tw.com.commandPattern;

import tw.com.commandPattern.devices.GarageDoor;
import tw.com.commandPattern.devices.Light;
import tw.com.commandPattern.impl.GarageDoorUpCommand;
import tw.com.commandPattern.impl.LightOnCommand;

public class Test {

	public static void main(String[] args) {
		
		Light light = new Light("Living room");
		Command command = new LightOnCommand(light);
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		simpleRemoteControl.setSlot(command);
		simpleRemoteControl.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor("");
		command = new GarageDoorUpCommand(garageDoor);
		simpleRemoteControl = new SimpleRemoteControl();
		simpleRemoteControl.setSlot(command);
		simpleRemoteControl.buttonWasPressed();
	}

}

package tw.com.commandPattern.impl;

import tw.com.commandPattern.Command;
import tw.com.commandPattern.devices.GarageDoor;

public class GarageDoorUpCommand implements Command {
	
	private GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
	}
	
	@Override
	public void undo() {
		garageDoor.down();
	}
}

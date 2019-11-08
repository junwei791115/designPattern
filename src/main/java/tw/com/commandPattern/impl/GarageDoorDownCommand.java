package tw.com.commandPattern.impl;

import tw.com.commandPattern.Command;
import tw.com.commandPattern.devices.GarageDoor;

public class GarageDoorDownCommand implements Command {
	
	private GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		super();
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.down();
	}
	
	@Override
	public void undo() {
		garageDoor.up();
	}
}

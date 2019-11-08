package tw.com.commandPattern.impl;

import tw.com.commandPattern.Command;
import tw.com.commandPattern.devices.Sprinkler;

public class SprinklerOnCommand implements Command {
	
	private Sprinkler sprinkler;
	
	public SprinklerOnCommand(Sprinkler sprinkler) {
		super();
		this.sprinkler = sprinkler;
	}

	@Override
	public void execute() {
		this.sprinkler.waterOn();
	}
	
	@Override
	public void undo() {
		this.sprinkler.waterOff();
	}
}

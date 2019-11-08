package tw.com.commandPattern.impl;

import tw.com.commandPattern.Command;
import tw.com.commandPattern.devices.Sprinkler;

public class SprinklerOffCommand implements Command {
	
	private Sprinkler sprinkler;
	
	public SprinklerOffCommand(Sprinkler sprinkler) {
		super();
		this.sprinkler = sprinkler;
	}

	@Override
	public void execute() {
		this.sprinkler.waterOff();
	}
	
	@Override
	public void undo() {
		this.sprinkler.waterOn();
	}
}

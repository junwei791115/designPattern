package tw.com.commandPattern.impl;

import tw.com.commandPattern.Command;
import tw.com.commandPattern.devices.CeilingFan;

public class CeilingFanOffCommand implements Command {
	
	private CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.ceilingFan.off();
	}

	@Override
	public void undo() {
		this.ceilingFan.high();
	}
}

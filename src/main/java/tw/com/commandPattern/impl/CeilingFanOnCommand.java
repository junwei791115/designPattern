package tw.com.commandPattern.impl;

import tw.com.commandPattern.Command;
import tw.com.commandPattern.devices.CeilingFan;

public class CeilingFanOnCommand implements Command {
	
	private CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.ceilingFan.high();
	}
	
	@Override
	public void undo() {
		this.ceilingFan.off();
	}
}

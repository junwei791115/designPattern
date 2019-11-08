package tw.com.commandPattern.impl;

import tw.com.commandPattern.Command;
import tw.com.commandPattern.devices.Light;

public class LivingroomLightOffCommand implements Command {
	Light light;

	public LivingroomLightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}
	
	@Override
	public void undo() {
		light.on();
	}
}

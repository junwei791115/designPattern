package tw.com.commandPattern.impl;

import tw.com.commandPattern.Command;
import tw.com.commandPattern.devices.Stereo;

public class StereoOffCommand implements Command {
	private Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}

	@Override
	public void execute() {
		this.stereo.off();
	}

	@Override
	public void undo() {
		this.stereo.on();
	}
}

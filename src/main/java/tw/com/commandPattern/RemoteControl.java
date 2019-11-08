package tw.com.commandPattern;

import tw.com.commandPattern.impl.NoCommand;

public class RemoteControl {
	private Command[] onCommands;
	private Command[] offCommands;
	private int slots = 0;
	Command undoCommand;

	public RemoteControl(int slots) {
		this.slots = slots;
		this.onCommands = new Command[this.slots];
		this.offCommands = new Command[this.slots];
		Command noCommand = new NoCommand();
		for (int i = 0; i < this.slots; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		this.undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		this.onCommands[slot] = onCommand;
		this.offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		this.onCommands[slot].execute();
		this.undoCommand = this.onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		this.offCommands[slot].execute();
		this.undoCommand = this.offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		this.undoCommand.undo();
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n---------Remote Control-------------\n");

		for (int i = 0; i < this.slots; i++) {
			builder.append("\n=====").append(i).append("=====\n");
			builder.append("[slot ").append(i).append("]").append("\n");
			builder.append(this.onCommands[i].getClass().getName()).append("\n");
			builder.append(this.offCommands[i].getClass().getName()).append("\n");
		}
		return builder.toString();
	}

}

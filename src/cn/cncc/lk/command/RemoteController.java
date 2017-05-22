package cn.cncc.lk.command;

import java.util.Stack;

public class RemoteController {
	Command[] onCommands;
	Command[] offCommands;
	Stack<Command> undoCommands;
	
	public RemoteController() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommands = new Stack<Command>();
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPressed(int slot) {
		onCommands[slot].execute();
		undoCommands.push(onCommands[slot]);
	}
	
	public void offButtonWasPressed(int slot) {
		offCommands[slot].execute();
		undoCommands.push(offCommands[slot]);
	}
	
	public void undoButtonWasPressed() {
		if (undoCommands.isEmpty()) return;
		Command undoCommand = undoCommands.pop();
		undoCommand.undo();
	}
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n----------- Remote Controller -------------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuffer.append("[slot " + i + "] " 
					+ onCommands[i].getClass().getSimpleName() + " "
					+ offCommands[i].getClass().getSimpleName() + "\n");
		}
		return stringBuffer.toString();
	}
}

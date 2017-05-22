package cn.cncc.lk.command;

public class SimpleRemoteController {
	Command slot;
	
	public SimpleRemoteController() {}
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}

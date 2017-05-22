package cn.cncc.lk.command;

public class GarageDoorOpenCommand implements Command {

	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.open();
	}

	@Override
	public void undo() {
		
	}

}

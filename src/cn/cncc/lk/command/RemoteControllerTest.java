package cn.cncc.lk.command;

public class RemoteControllerTest {
	public static void main(String[] args) {
		SimpleRemoteController remote = new SimpleRemoteController();
		Light light = new Light();
		LightOnCommand lighton = new LightOnCommand(light);
		
		remote.setCommand(lighton);
		remote.buttonWasPressed();
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(garageDoorOpen);
		remote.buttonWasPressed();
	}
}

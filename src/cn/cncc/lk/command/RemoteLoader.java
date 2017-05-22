package cn.cncc.lk.command;

public class RemoteLoader {
	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController();
		Light livingRoomLight = new Light("Living Room");
		Light kitchentLight = new Light("Kitchent");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchentLightOn = new LightOnCommand(kitchentLight);
		LightOffCommand kitchentLightOff = new LightOffCommand(kitchentLight);
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		remoteController.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteController.setCommand(1, kitchentLightOn, kitchentLightOff);
		remoteController.setCommand(2, ceilingFanOn, ceilingFanOff);
		
		System.out.println(remoteController);
		
		remoteController.onButtonWasPressed(0);
		remoteController.offButtonWasPressed(0);
		remoteController.onButtonWasPressed(1);
		remoteController.offButtonWasPressed(1);
		remoteController.onButtonWasPressed(2);
		remoteController.offButtonWasPressed(2);
		
		System.out.println("------------- undo ---------------");
		
		remoteController.undoButtonWasPressed();
		remoteController.undoButtonWasPressed();
		remoteController.undoButtonWasPressed();
	}
}

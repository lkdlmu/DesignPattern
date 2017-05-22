package cn.cncc.lk.command;

public class CeilingFan {
	private String location;
	
	public CeilingFan() {}
	
	public CeilingFan(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + "CeilingFan is on!");
	}
	
	public void off() {
		System.out.println(location + "CeilingFan is off!");
	}
}

package cn.cncc.lk.state;

public class GumballMachineTestDrive {
	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println();
	}
}

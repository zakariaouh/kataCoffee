package com.kata.coffee.machine;

public class Main {
	public static void main(String[] pArgs) throws Exception {
		CoffeeMachine vMachine = new CoffeeMachine();
		vMachine.sendInstructions("Th:1:0");
		vMachine.sendInstructions("H::");
		vMachine.sendInstructions("C:2:0");
		vMachine.sendInstructions("M:this is a message");
	}
}

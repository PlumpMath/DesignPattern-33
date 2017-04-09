package com.design.command.define;

public class Main {

	public static void main(String[] args) {
		
		Invoker invoker = new Invoker();
		
		ConcreteReceiver concreteReceiver = new ConcreteReceiver();
		ConcreteReceiverA concreteReceiverA = new ConcreteReceiverA();
		ConcreteReceiverB concreteReceiverB = new ConcreteReceiverB();
		
		Command command1 = new ConcreteCommand(concreteReceiver);
		Command command2 = new ConcreteCommandA(concreteReceiverA);
		Command command3 = new ConcreteCommandB(concreteReceiverB);
		
		invoker.invoke(command1);
		invoker.invoke(command2);
		invoker.invoke(command3);
		
	}

}

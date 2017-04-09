package com.design.command.define;

public class ConcreteCommandA extends Command {

	ConcreteReceiverA Receiver;
	
	

	public ConcreteCommandA(ConcreteReceiverA receiver) {
		super();
		Receiver = receiver;
	}



	@Override
	public void execute() {
		Receiver.action();
	}

}

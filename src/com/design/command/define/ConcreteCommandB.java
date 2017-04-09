package com.design.command.define;

public class ConcreteCommandB extends Command {

	ConcreteReceiverB receiver;
	
	
	public ConcreteCommandB(ConcreteReceiverB receiver) {
		super();
		this.receiver = receiver;
	}


	@Override
	public void execute() {
		receiver.action();
	}

}

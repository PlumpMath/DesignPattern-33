package com.design.command.define;


public class ConcreteCommand extends Command {

	ConcreteReceiver receiver;
	
	public ConcreteCommand(ConcreteReceiver receiver) {
		super();
		this.receiver = receiver;
	}



	@Override
	public void execute() {
		receiver.action();
	}

}

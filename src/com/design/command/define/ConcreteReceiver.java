package com.design.command.define;

public class ConcreteReceiver implements Receiver {

	@Override
	public void action() {
		System.out.println(this.getClass().getSimpleName() + " action() ");
	}

}

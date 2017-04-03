package com.design.mediator.define;

public class ConcreteColleagueA extends Colleague {

	public ConcreteColleagueA(Mediator mediator) {
		super(mediator);
	}

	@Override
	void action() {
		System.out.println(this.getClass().getSimpleName() + " action()");
		mediator.method(this);
	}

}

package com.design.mediator.define;

public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
	}

	@Override
	void action() {
		System.out.println(this.getClass().getSimpleName() + " action()");
	}

}

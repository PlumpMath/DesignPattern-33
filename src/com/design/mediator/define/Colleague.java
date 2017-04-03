package com.design.mediator.define;

public abstract class Colleague {
	Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	abstract void action();
}

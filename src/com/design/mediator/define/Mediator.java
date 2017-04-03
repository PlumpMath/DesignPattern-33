package com.design.mediator.define;

public abstract class Mediator {
	
	ConcreteColleagueA concreteColleagueA;
	ConcreteColleagueB concreteColleagueB;
	
	
	public ConcreteColleagueA getConcreteColleagueA() {
		return concreteColleagueA;
	}


	public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
		this.concreteColleagueA = concreteColleagueA;
	}


	public ConcreteColleagueB getConcreteColleagueB() {
		return concreteColleagueB;
	}


	public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
		this.concreteColleagueB = concreteColleagueB;
	}


	abstract void method(Colleague colleague);
}

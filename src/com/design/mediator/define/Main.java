package com.design.mediator.define;

public class Main {

	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		
		ConcreteColleagueA concreteA = new ConcreteColleagueA(mediator);
		ConcreteColleagueB concreteB = new ConcreteColleagueB(mediator);
		
		mediator.setConcreteColleagueA(concreteA);
		mediator.setConcreteColleagueB(concreteB);
		
		concreteA.action();
	}

}

package com.design.mediator.define;

public class ConcreteMediator extends Mediator {

	@Override
	void method(Colleague colleague) {
		if(colleague == concreteColleagueA) {
			concreteColleagueB.action();
		}else if(colleague == concreteColleagueB) {
			concreteColleagueB.action();
		}
	}

}

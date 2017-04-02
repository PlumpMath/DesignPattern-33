package com.design.facade.define;

public class ConcreteSystemB implements SystemB {

	@Override
	public void operationB() {
		System.out.println(this.getClass().getSimpleName() + " operationB()");
	}

}

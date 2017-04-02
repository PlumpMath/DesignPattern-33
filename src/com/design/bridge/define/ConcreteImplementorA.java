package com.design.bridge.define;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println(this.getClass().getSimpleName() + " operationImpl() called");
	}

}

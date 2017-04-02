package com.design.bridge.define;

public class ConcreteImplementorB implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println(this.getClass().getSimpleName() + " operationImpl() called");
	}

}

package com.design.bridge;

public class ConcreteImplementorA implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println(this.getClass().getSimpleName() + " operationImpl() called");
	}

}

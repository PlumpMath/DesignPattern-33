package com.design.bridge;

public class ConcreteImplementorB implements Implementor {

	@Override
	public void operationImpl() {
		System.out.println(this.getClass().getSimpleName() + " operationImpl() called");
	}

}

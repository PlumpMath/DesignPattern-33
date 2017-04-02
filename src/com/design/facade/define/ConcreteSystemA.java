package com.design.facade.define;

public class ConcreteSystemA implements SystemA {

	@Override
	public void operationA() {
		System.out.println(this.getClass().getSimpleName() + " operationA()");
	}

}

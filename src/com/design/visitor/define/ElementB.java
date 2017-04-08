package com.design.visitor.define;

public class ElementB implements Element {

	@Override
	public void accept(Visitor visitor) {
		System.out.println(this.getClass().getSimpleName() + " accept() called");
		visitor.visit(this);
	}

}

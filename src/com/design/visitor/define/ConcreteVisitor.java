package com.design.visitor.define;

public class ConcreteVisitor implements Visitor {

	@Override
	public void visit(ElementA elementA) {
		System.out.println(elementA);
	}

	@Override
	public void visit(ElementB elementB) {
		System.out.println(elementB);
	}

}

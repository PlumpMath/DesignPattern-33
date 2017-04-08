package com.design.visitor.define;

public class Main {

	public static void main(String[] args) {
		
		ObjectStruct objectStruct = new ObjectStruct();
		Visitor visitor = new ConcreteVisitor();
		objectStruct.getElementA().accept(visitor);
		objectStruct.getElementB().accept(visitor);

	}

}

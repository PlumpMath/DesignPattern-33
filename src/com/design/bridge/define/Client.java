package com.design.bridge.define;

public class Client {

	public void operationA() {
		Abstract abstractA = new ReDefinedAbstract(new ConcreteImplementorA());
		abstractA.operation();
	}
	
	public void operationB() {
		Abstract abstractB = new ReDefinedAbstract(new ConcreteImplementorB());
		abstractB.operation();
	}
}

package com.design.decorate.define;

public class Main {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		Decorator decoratorA = new ConcreteDecoratorA(component);
		decoratorA.operate();
		
		Decorator decoratorB = new ConcreteDecoratorB(component);
		decoratorB.operate();
	}

}

package com.design.decorate.define;

public class ConcreteDecoratorA extends Decorator {

	public ConcreteDecoratorA(Component component) {
		super(component);
	}

	@Override
	public void operateA() {
		System.out.println(this.getClass().getSimpleName() + " operateA()");
	}

	@Override
	public void operate() {
		operateA();
		component.operate();
		operateB();
	}

	@Override
	public void operateB() {
		System.out.println(this.getClass().getSimpleName() + " operateB()");
	}

}

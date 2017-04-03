package com.design.decorate.define;

public class ConcreteDecoratorB extends Decorator {

	public ConcreteDecoratorB(Component component) {
		super(component);
	}

	@Override
	public void operateA() {
		System.out.println(this.getClass().getSimpleName() + " operateA()");
	}

	@Override
	public void operate() {
		operateB();
		component.operate();
		operateA();
	}

	@Override
	public void operateB() {
		System.out.println(this.getClass().getSimpleName() + " operateB()");
	}

}

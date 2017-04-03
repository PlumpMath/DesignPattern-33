package com.design.decorate.define;

public class ConcreteComponent implements Component {

	@Override
	public void operate() {
		System.out.println(this.getClass().getSimpleName() + " operate()");
	}

}

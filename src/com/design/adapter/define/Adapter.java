package com.design.adapter.define;

public class Adapter extends Adaptee implements Target {

	@Override
	public void operation1() {
		System.out.println(this.getClass().getSimpleName() + " operation1()");
	}

	@Override
	public void opeartion2() {
		operation3();
	}

}

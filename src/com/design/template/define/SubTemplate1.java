package com.design.template.define;

public class SubTemplate1 extends AbstractTemplate {

	@Override
	public void operation1() {
		System.out.println(this.getClass().getSimpleName() + " operation1()");
	}

	@Override
	public void operation2() {
		System.out.println(this.getClass().getSimpleName() + " operation2()");
	}

	@Override
	public void operation3() {
		System.out.println(this.getClass().getSimpleName() + " operation3()");
	}

}

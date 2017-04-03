package com.design.decorate.sample;

public class Boy extends Person {

	@Override
	public void dressed() {
		System.out.println(this.getClass().getSimpleName() + " dressed");
	}

}

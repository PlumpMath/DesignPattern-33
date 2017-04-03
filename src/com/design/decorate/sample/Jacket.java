package com.design.decorate.sample;

public class Jacket extends DressedDecorator {

	public Jacket(Person person) {
		super(person);
	}

	@Override
	public void dressed() {
		person.dressed();
		straightens();
	}

	public void straightens() {
		System.out.println(this.getClass().getSimpleName() + " straightens()");
	}

}

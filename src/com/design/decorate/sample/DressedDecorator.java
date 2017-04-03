package com.design.decorate.sample;

public abstract class DressedDecorator extends Person {

	Person person;
	public DressedDecorator(Person person) {
		this.person = person;
	}
}

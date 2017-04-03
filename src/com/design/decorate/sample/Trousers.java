package com.design.decorate.sample;


public class Trousers extends DressedDecorator {

	public Trousers(Person person) {
		super(person);
	}


	@Override
	public void dressed() {
		person.dressed();
		roll();
	}
	
	public void roll(){
		System.out.println(this.getClass().getSimpleName() + " roll()");
	}

}

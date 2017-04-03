package com.design.decorate.sample;

public class Main {

	public static void main(String[] args) {
		Person person = new Boy();
		
		DressedDecorator jacketDecorator = new Jacket(person);
		jacketDecorator.dressed();
		
		DressedDecorator trouserDecorator = new Trousers(person);
		trouserDecorator.dressed();
	}

}

package com.design.observer.define;

public class ConcreteObserver implements Observer {

	@Override
	public void update(Object object) {
		System.out.println("object = " + object);
	}

}

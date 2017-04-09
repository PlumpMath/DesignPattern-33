package com.design.observer.define;



public class ConcreteSubject extends Subject {

	String contentString;
	public ConcreteSubject(Observer observer) {
		super(observer);
		
		contentString = "observer of design pattern";
	}

	@Override
	public void notifyObservers(Object object) {
		observer.update(contentString);
	}
}

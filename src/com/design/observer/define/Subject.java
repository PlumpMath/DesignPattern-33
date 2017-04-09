package com.design.observer.define;

public abstract class Subject {
	Observer observer;
	
	public Subject(Observer observer) {
		this.observer = observer;
	}
	public abstract void notifyObservers(Object object);
}

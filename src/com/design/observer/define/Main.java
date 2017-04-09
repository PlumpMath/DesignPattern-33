package com.design.observer.define;

public class Main {

	public static void main(String[] args) {
		Observer observer = new ConcreteObserver();
		Subject subject = new ConcreteSubject(observer);
		subject.notifyObservers(null);
	}

}

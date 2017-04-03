package com.design.composite.define;

public abstract class Component {
	String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	abstract void addChild(Component component);
	abstract void removeChild(Component component);
	abstract void doSomething();
}

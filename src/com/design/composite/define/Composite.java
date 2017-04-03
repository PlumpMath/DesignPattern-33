package com.design.composite.define;

import java.util.ArrayList;


public class Composite extends Component {

	ArrayList<Component> mComponents = new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	void addChild(Component component) {
		mComponents.add(component);
	}

	@Override
	void removeChild(Component component) {
		mComponents.remove(component);
	}

	@Override
	void doSomething() {
		System.out.println("I am a composite , and My name is " + name);
		for (Component component : mComponents) {
			component.doSomething();
		}
	}

}

package com.design.composite.define;

public class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	void addChild(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	void removeChild(Component component) {
		throw new UnsupportedOperationException();
	}

	@Override
	void doSomething() {
		System.out.println("I am a leaf,and My name is " + name);
	}

}

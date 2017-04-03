package com.design.composite.sample;

public class TextView extends View {

	public TextView(String name) {
		super(name);
	}

	@Override
	void measure() {
		System.out.println(this.getClass().getSimpleName() + " measure " + name);
	}

	@Override
	void layout() {
		System.out.println(this.getClass().getSimpleName() + " layout " + name);
	}

	@Override
	void draw() {
		System.out.println(this.getClass().getSimpleName() + " draw " + name);
	}

}

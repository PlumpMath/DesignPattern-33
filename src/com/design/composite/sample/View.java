package com.design.composite.sample;

public abstract class View {
	
	String name;
	public View(String name) {
		this.name = name;
	}
	abstract void measure();
	abstract void layout();
	abstract void draw();
	
}

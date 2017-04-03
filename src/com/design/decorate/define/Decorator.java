package com.design.decorate.define;

public abstract class Decorator implements Component{
	Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	abstract void operateA();	
	abstract void operateB();
}

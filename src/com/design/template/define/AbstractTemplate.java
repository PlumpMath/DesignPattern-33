package com.design.template.define;

public abstract class AbstractTemplate {
	public abstract void operation1();
	public abstract void operation2();
	public abstract void operation3();
	
	public void execute() {
		operation1();
		operation2();
		operation3();
	}
}

package com.design.proxy.define;

public class RealSubject extends Subject {

	@Override
	void visit() {
		System.out.println(this.getClass().getSimpleName() + " visit()");
	}

}

package com.design.proxy.define;

public class ProxySubject extends Subject {

	RealSubject mRealSubject = new RealSubject();
	@Override
	void visit() {
		mRealSubject.visit();
	}

}

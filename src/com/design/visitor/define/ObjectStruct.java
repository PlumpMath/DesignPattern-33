package com.design.visitor.define;

public class ObjectStruct {
	Element mElementA;
	Element mElementB;
	
	public ObjectStruct() {
		mElementA = new ElementA();
		mElementB = new ElementB();
	}

	public Element getElementA() {
		return mElementA;
	}

	public void setElementA(Element elementA) {
		this.mElementA = elementA;
	}

	public Element getElementB() {
		return mElementB;
	}

	public void setElementB(Element elementB) {
		this.mElementB = elementB;
	}
	
	
}

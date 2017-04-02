package com.design.facade.define;

public class Facade {
	public void operationA(){
		SystemA systemA = new ConcreteSystemA();
		systemA.operationA();
	}
	
	public void operationB(){
		SystemB systemB = new ConcreteSystemB();
		systemB.operationB();
	}
}

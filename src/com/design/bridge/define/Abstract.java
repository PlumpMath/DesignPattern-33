package com.design.bridge.define;

public abstract class Abstract {
	
	Implementor mImplementor;
	
	public Abstract(Implementor implementor) {
		mImplementor = implementor;
	}
	

	protected void operation(){
		/**
		 * 调用具体实现
		 */
		mImplementor.operationImpl();
	}
}

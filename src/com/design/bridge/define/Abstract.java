package com.design.bridge.define;

public abstract class Abstract {
	
	Implementor mImplementor;
	
	public Abstract(Implementor implementor) {
		mImplementor = implementor;
	}
	

	protected void operation(){
		/**
		 * ���þ���ʵ��
		 */
		mImplementor.operationImpl();
	}
}

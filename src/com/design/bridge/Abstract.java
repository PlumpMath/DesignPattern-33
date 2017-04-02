package com.design.bridge;

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

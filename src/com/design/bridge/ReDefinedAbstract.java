package com.design.bridge;

public class ReDefinedAbstract extends Abstract {

	public ReDefinedAbstract(Implementor implementor) {
		super(implementor);
	}

	@Override
	protected void operation() {
		super.operation();
		
		System.out.println(this.getClass().getSimpleName() + " operation() called");
	}

}

package com.design.interpret;

public class NonterminalExpression extends AbstractExpression {

	@Override
	public void interpret(Context context) {
		System.out.println(this.getClass().getSimpleName() + " interpret()");
	}

}

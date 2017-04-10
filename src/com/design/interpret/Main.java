package com.design.interpret;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<AbstractExpression> expressions = new ArrayList<AbstractExpression>();
		
		for(int i = 0;i < 100;i ++) {
			if( i % 2 == 0) {
				expressions.add(new TerminalExpression());
			}else  {
				expressions.add(new NonterminalExpression());
			}
		}
		
		for(int i = 0;i < expressions.size();i ++) {
			expressions.get(i).interpret(new Context());
		}
	}
	

}

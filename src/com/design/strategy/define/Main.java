package com.design.strategy.define;

public class Main {

	public static void main(String[] args) {
		Context context = new Context();
		
		Strategy strategyA = new ConreteStrategyA();
		Strategy strategyB = new ConreteStrategyB();
		
		context.setStrategy(strategyA);
		context.algorithm();
		
		context.setStrategy(strategyB);
		context.algorithm();
	}

}

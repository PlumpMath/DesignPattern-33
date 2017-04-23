package com.design.strategy.define;

public class ConreteStrategyB implements Strategy {

	@Override
	public void algorithm() {
		System.out.println(this.getClass().getSimpleName() + " algorithm");
	}

}

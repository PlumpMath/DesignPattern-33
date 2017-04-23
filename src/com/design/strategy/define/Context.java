package com.design.strategy.define;

public class Context {
	Strategy mStrategy;

	public Strategy getStrategy() {
		return mStrategy;
	}

	public void setStrategy(Strategy strategy) {
		this.mStrategy = strategy;
	}
	
	public void algorithm(){
		mStrategy.algorithm();
	}
	
}

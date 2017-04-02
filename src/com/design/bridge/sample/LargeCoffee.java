package com.design.bridge.sample;

public class LargeCoffee extends Coffee {

	public LargeCoffee(CoffeeAditivies aditivies) {
		super(aditivies);
	}
	
	@Override
	public void makeCoffee() {
		
		System.out.println(this.getClass().getSimpleName() + " " + mCoffeeAditivies.makeCoffeeImpl());
	}

}

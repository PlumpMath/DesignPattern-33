package com.design.bridge.sample;

public class SmallCoffee extends Coffee {

	public SmallCoffee(CoffeeAditivies aditivies) {
		super(aditivies);
	}
	
	@Override
	public void makeCoffee() {
		
		System.out.println(this.getClass().getSimpleName() + " " + mCoffeeAditivies.makeCoffeeImpl());
	}

}

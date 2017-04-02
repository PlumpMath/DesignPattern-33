package com.design.bridge.sample;

public abstract class Coffee {
	CoffeeAditivies mCoffeeAditivies;
	
	public Coffee(CoffeeAditivies aditivies) {
		mCoffeeAditivies = aditivies;
	}
	
	public void makeCoffee(){
		mCoffeeAditivies.makeCoffeeImpl();
	}
}

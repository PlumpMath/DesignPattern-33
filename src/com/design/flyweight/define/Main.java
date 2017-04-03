package com.design.flyweight.define;

public class Main {

	
	public static void main(String[] args) {
		FlyWeightFactory mFlyWeightFactory = new FlyWeightFactory();
		FlyWeight c1 = mFlyWeightFactory.getFlyWeight("c1");
		c1.doSomething();
		
		FlyWeight c2 = mFlyWeightFactory.getFlyWeight("c2");
		c2.doSomething();
		
		FlyWeight c1alia = mFlyWeightFactory.getFlyWeight("c1");
		c1alia.doSomething();
	}

}

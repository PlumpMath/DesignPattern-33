package com.design.flyweight.define;

public class ConcreteFlyWeight implements FlyWeight {

	String instrinsicStat;
	public ConcreteFlyWeight(String instrinsic) {
		instrinsicStat = instrinsic;
	}
	@Override
	public void doSomething() {
		System.out.println(this.getClass().getSimpleName() + " doSomething instrinsicStat : " + instrinsicStat);
	}

}

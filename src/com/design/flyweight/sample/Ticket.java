package com.design.flyweight.sample;

public abstract class Ticket extends ObjectUnit{
	
	public Ticket(ObjectPool objectPool) {
		super(objectPool);
	}

	String from;
	String to;
	int price;
	
	@Override
	public String toString() {
		return "from : " + from + "; to : " + to + "; price : " + price;
	}
}

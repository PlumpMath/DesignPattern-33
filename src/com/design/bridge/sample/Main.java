package com.design.bridge.sample;

public class Main {

	public static void main(String[] args) {

		Coffee largeAddSugerCoffee = new LargeCoffee(new Suger());
		largeAddSugerCoffee.makeCoffee();
		
		Coffee largeOrdinaryCoffee = new LargeCoffee(new Ordinary());
		largeOrdinaryCoffee.makeCoffee();
		
		Coffee smallAddSugerCoffee = new SmallCoffee(new Suger());
		smallAddSugerCoffee.makeCoffee();
		
		Coffee smallOrdinaryCoffee = new SmallCoffee(new Ordinary());
		smallOrdinaryCoffee.makeCoffee();
	}

}

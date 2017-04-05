package com.design.iterator.define;

public class Main {

	public static void main(String[] args) {
		
		Aggregate<String> aggregate = new ConcreateAggregate<String>();
		
		aggregate.add("One");
		aggregate.add("Two");
		aggregate.add("Three");
		aggregate.add("Four");
		aggregate.add("Five");
		aggregate.add("Six");
		aggregate.add("Seven");
		aggregate.add("Eight");
		aggregate.add("Nine");
		aggregate.add("Ten");
		
		Iterator<String> iterator = aggregate.iterator();
		while(iterator.hasNext()) {
			String string = iterator.next();
			System.out.println("iterator " + string);
		}
	}

}

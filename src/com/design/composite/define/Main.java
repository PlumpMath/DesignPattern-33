package com.design.composite.define;

public class Main {

	public static void main(String[] args) {
		Component root = new Composite("Root");
		
		Component branch1 = new Composite("branch1");
		Component branch2 = new Composite("branch2");
		
		Component leaf1 = new Leaf("leaf1");
		Component leaf2 = new Leaf("leaf2");
		
		root.addChild(leaf1);
		root.addChild(leaf2);
		root.addChild(branch1);
		root.addChild(branch2);
		
		Component leaf11 = new Leaf("branch1-leaf1");
		Component leaf22 = new Leaf("branch2-leaf1");
		
		branch1.addChild(leaf11);
		branch2.addChild(leaf22);
		
		root.doSomething();
	}

}

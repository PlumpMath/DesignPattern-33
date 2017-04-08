package com.design.visitor.sample;

import java.util.Random;

public class Manager extends Staff {

	public Manager(String name) {
		this.name = name;
		this.KPI = new Random().nextInt(4);
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}

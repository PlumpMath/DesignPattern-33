package com.design.visitor.sample;

public class CTO implements Visitor {

	@Override
	public void visit(Staff staff) {
		System.out.println("staff name = " + staff.name + "; staff KPI = " + staff.KPI);
	}

}

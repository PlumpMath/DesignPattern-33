package com.design.visitor.sample;

public abstract class Staff {
	String name;
	int KPI;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKPI() {
		return KPI;
	}
	public void setKPI(int kPI) {
		KPI = kPI;
	}
	
	public abstract void accept(Visitor visitor);
}

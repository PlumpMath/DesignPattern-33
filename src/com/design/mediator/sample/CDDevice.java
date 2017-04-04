package com.design.mediator.sample;

public class CDDevice extends Colleague {

	String data;
	public CDDevice(Mediator mediator) {
		super(mediator);
	}
	
	public String readData() {
		return data;
	}
	
	public void load() {
		
		data = "data video,data sound";		
		mediator.change(this);
	}

}

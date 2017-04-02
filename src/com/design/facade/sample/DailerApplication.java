package com.design.facade.sample;

public class DailerApplication implements IDailer {

	@Override
	public void dail() {
		System.out.println(this.getClass().getSimpleName() + " dail()");
	}

	@Override
	public void hangUp() {
		System.out.println(this.getClass().getSimpleName() + " hangUp()");
	}

	@Override
	public void suspend() {
		System.out.println(this.getClass().getSimpleName() + " suspend()");
	}

	@Override
	public void resume() {
		System.out.println(this.getClass().getSimpleName() + " resume()");		
	}

}

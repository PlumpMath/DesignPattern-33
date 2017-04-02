package com.design.facade.sample;

public class CameraApplication implements ICamera {

	@Override
	public void capture() {
		System.out.println(this.getClass().getSimpleName() + " capture()");
	}

	@Override
	public void video() {
		System.out.println(this.getClass().getSimpleName() + " video()");
	}

}

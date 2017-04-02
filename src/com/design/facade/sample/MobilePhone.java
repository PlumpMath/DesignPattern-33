package com.design.facade.sample;

public class MobilePhone {

	IDailer mDailer = new DailerApplication();
	ICamera mCamera = new CameraApplication();
	
	public void dail(){
		mDailer.dail();
	}
	public void hangUp(){
		mDailer.hangUp();
	}
	public void suspend(){
		mDailer.suspend();
	}
	
	public void resume(){
		mDailer.resume();
	}
	
	public void capture(){
		mCamera.capture();
	}
	public void video(){
		mCamera.video();
	}
}

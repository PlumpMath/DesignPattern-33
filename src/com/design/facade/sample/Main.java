package com.design.facade.sample;

public class Main {

	public static void main(String[] args) {
		MobilePhone mobilePhone = new MobilePhone();
		
		mobilePhone.capture();
		mobilePhone.video();
		
		mobilePhone.dail();
		mobilePhone.suspend();
		mobilePhone.resume();
		mobilePhone.hangUp();
	}

}

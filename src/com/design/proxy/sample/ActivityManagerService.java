package com.design.proxy.sample;

public class ActivityManagerService extends ActivityManagerNative {

	@Override
	void startActivity() {
		System.out.println(this.getClass().getSimpleName() + " startActivity()");
	}

	@Override
	void startService() {
		System.out.println(this.getClass().getSimpleName() + " startService()");
	}

	@Override
	void broadcast() {
		System.out.println(this.getClass().getSimpleName() + " broadcast()");
	}

	@Override
	void getContentProvider() {
		System.out.println(this.getClass().getSimpleName() + " getContentProvider()");
	}

}

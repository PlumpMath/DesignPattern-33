package com.design.proxy.sample;

public class ActivityManagerProxy extends IActivityManager {

	ActivityManagerNative mAms = new ActivityManagerService();
	@Override
	void startActivity() {
		mAms.startActivity();
	}

	@Override
	void startService() {
		mAms.startService();
	}

	@Override
	void broadcast() {
		mAms.broadcast();
	}

	@Override
	void getContentProvider() {
		mAms.getContentProvider();
	}

}

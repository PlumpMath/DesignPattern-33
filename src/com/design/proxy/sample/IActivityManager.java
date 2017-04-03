package com.design.proxy.sample;

public abstract class IActivityManager {
	abstract void startActivity();
	abstract void startService();
	abstract void broadcast();
	abstract void getContentProvider();
}

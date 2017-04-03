package com.design.proxy.sample;

public class Main {

	public static void main(String[] args) {
		ActivityManagerProxy proxy = new ActivityManagerProxy();
		proxy.startActivity();
		proxy.startService();
		proxy.broadcast();
		proxy.getContentProvider();
	}

}

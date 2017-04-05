package com.design.template.sample;

public class Main {

	public static void main(String[] args) {
		Activity activity = new SubActivity();
		activity.startActivity();
		activity.changeToBackground();
		activity.changeToForeground();
		activity.finishActivity();
	}

}

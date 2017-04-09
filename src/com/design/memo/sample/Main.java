package com.design.memo.sample;

public class Main {

	public static void main(String[] args) {
		Activity activity = new Activity();
		ActivityManager activityManager = new ActivityManager();
		
		activityManager.pauseActivity(activity);
		activityManager.resumeActivity(activity);
	}

}

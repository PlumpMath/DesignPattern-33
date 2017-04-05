package com.design.template.sample;

public abstract class Activity {
	public abstract void onCreate();
	public abstract void onStart();
	public abstract void onResume();
	public abstract void onPause();
	public abstract void onStop();
	public abstract void onDestroy();
	
	public void startActivity() {
		
		onCreate();
		onStart();
		onResume();
	}
	
	public void changeToBackground() {
		
		onPause();
		onStop();
	}
	
	public void changeToForeground() {
		
		onResume();
		onStart();
	}
	
	public void finishActivity() {
		
		onStop();
		onDestroy();
	}
}

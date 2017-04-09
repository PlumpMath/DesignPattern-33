package com.design.memo.sample;

public class Activity {
	private int key_1 = 1;
	private int key_2 = 2;
	private int key_3 = 3;
	private int key_4 = 4;
	
	private String state;
	private String name;
	private String windowState;
	private String viewState;
	
	public void onPause(){
		state = "pauseActivity";
		name = "activity";
		windowState = "window pause";
		viewState = "view pause";
	}
	
	public void onSave(Bundle outBundle){
		outBundle.put(key_1, state);
		outBundle.put(key_2, name);
		outBundle.put(key_3, windowState);
		outBundle.put(key_4, viewState);
		
	}
	
	public void onStore(Bundle inBundle) {
		state = (String) inBundle.get(key_1);
		name = (String) inBundle.get(key_2);
		windowState = (String) inBundle.get(key_3);
		viewState = (String) inBundle.get(key_4);
	}
	
	public void onResume() {
		System.out.println("name = " + name);
		System.out.println("state = " + state);
		System.out.println("windowState = " + windowState);
		System.out.println("viewState = " + viewState);
	}
}

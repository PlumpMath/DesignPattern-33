package com.design.composite.sample;

import java.util.ArrayList;

public abstract class ViewGroup extends View implements ViewParent,ViewManager {

	ArrayList<View> mViews = new ArrayList<View>();
	
	public ViewGroup(String name) {
		super(name);
	}

	@Override
	void measure() {
		System.out.println(this.getClass().getSimpleName() + " measure " + name);
		for (View view : mViews) {
			view.measure();
		}
	}

	@Override
	void layout() {
		System.out.println(this.getClass().getSimpleName() + " layout " + name);
		for (View view : mViews) {
			view.layout();
		}
	}

	@Override
	void draw() {
		System.out.println(this.getClass().getSimpleName() + " draw " + name);
		for (View view : mViews) {
			view.draw();
		}
	}

	@Override
	public void addView(View view) {
		mViews.add(view);
	}

	@Override
	public void removeView(View view) {
		mViews.remove(view);
	}

	@Override
	public void updateView(View view) {
		view.name = view.name + "_updated";
	}

	@Override
	public void requestLayout() {
		measure();
		layout();
		draw();
	}

}

package com.design.template.sample;

public class SubActivity extends Activity {

	@Override
	public void onCreate() {
		System.out.println(this.getClass().getSimpleName() + " onCreate()");
	}

	@Override
	public void onStart() {
		System.out.println(this.getClass().getSimpleName() + " onStart()");
	}

	@Override
	public void onResume() {
		System.out.println(this.getClass().getSimpleName() + " onResume()");
	}

	@Override
	public void onPause() {
		System.out.println(this.getClass().getSimpleName() + " onPause()");
	}

	@Override
	public void onStop() {
		System.out.println(this.getClass().getSimpleName() + " onStop()");
	}

	@Override
	public void onDestroy() {
		System.out.println(this.getClass().getSimpleName() + " onDestroy()");
	}

}

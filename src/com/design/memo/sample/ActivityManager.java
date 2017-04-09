package com.design.memo.sample;

import java.util.HashMap;

public class ActivityManager {
	private HashMap<Activity, Bundle> map = new HashMap<Activity, Bundle>();
	public void pauseActivity(Activity activity) {
		activity.onPause();
		Bundle bundle = map.get(activity);
		if(bundle == null) {
			bundle = new Bundle();
			map.put(activity, bundle);
		}
		
		activity.onSave(map.get(activity));
	}
	
	public void resumeActivity(Activity activity) {
		activity.onResume();
		activity.onStore(map.get(activity));
	}
}

package com.design.flyweight.sample;

import java.util.ArrayList;

public abstract class ObjectPool {
	private static final int MAX_POOL_SIZE = 20;
	private ArrayList<ObjectUnit> mObjectUnits = new ArrayList<ObjectUnit>();

	public ObjectUnit obtain() {
		ObjectUnit objectUnit = getObjectUnit();
		synchronized (mObjectUnits) {
			if (objectUnit == null) {
				if (mObjectUnits.size() < MAX_POOL_SIZE) {
					objectUnit = createNewObjectUnit();
					objectUnit.isRecycled = false;
					mObjectUnits.add(objectUnit);
					System.out.println(Thread.currentThread().getName() + " new ObjectUnit");
				} else {
					try {
						long time1 = System.currentTimeMillis();
						mObjectUnits.wait();
						System.out.println(Thread.currentThread().getName() + " wait : " + (System.currentTimeMillis() - time1));
						objectUnit = getObjectUnit();
						objectUnit.isRecycled = false;
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}else {
				System.out.println(Thread.currentThread().getName() + " cache ObjectUnit");
			}
		}

		return objectUnit;
	}

	private ObjectUnit getObjectUnit() {
		synchronized (mObjectUnits) {
			for (int i = 0; i < mObjectUnits.size(); i++) {
				ObjectUnit objectUnit = mObjectUnits.get(i);
				synchronized (objectUnit) {
					if (objectUnit.isRecycled == true) {
						return objectUnit;
					}
				}
			}
		}
		return null;
	}
	public void recycle() {
		synchronized (mObjectUnits) {
			mObjectUnits.notifyAll();
		}
		
	}
	protected abstract ObjectUnit createNewObjectUnit();
}

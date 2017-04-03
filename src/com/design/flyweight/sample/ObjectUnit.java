package com.design.flyweight.sample;

public abstract class ObjectUnit {
	boolean isRecycled;

	ObjectPool mObjectPool;

	public ObjectUnit(ObjectPool objectPool) {
		mObjectPool = objectPool;
	}

	@Override
	public String toString() {
		return "isRecycled : " + isRecycled;
	}

	public void recycle() {
		isRecycled = true;
		mObjectPool.recycle();
	}
}

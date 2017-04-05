package com.design.iterator.sample;

public interface Iterator<T> {

	public void moveToFirst();
	public void moveToLast();
	public boolean hasNext();
	public T next();
}

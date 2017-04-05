package com.design.iterator.define;

public interface Aggregate<T> {

	public void add(T t);
	public T remove(int i);
	public Iterator<T> iterator();
}

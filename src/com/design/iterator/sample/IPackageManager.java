package com.design.iterator.sample;

public interface IPackageManager<T> {
	public void add(T t);
	public T remove(int index);
	public Iterator<T> iterator();
	public Iterator<T> reverseIterator();
}

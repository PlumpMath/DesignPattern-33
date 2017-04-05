package com.design.iterator.sample;

import java.util.ArrayList;
import java.util.List;

public class PackageManager<T> implements IPackageManager<T> {

	List<T> mList = new ArrayList<T>();
	@Override
	public void add(T t) {
		mList.add(t);
	}

	@Override
	public T remove(int index) {
		return mList.remove(index);
	}

	@Override
	public Iterator<T> iterator() {
		return new ListIterator<T>(mList);
	}

	@Override
	public Iterator<T> reverseIterator() {
		return new ReverseIterator<T>(mList);
	}

}

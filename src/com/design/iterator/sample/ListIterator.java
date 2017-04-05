package com.design.iterator.sample;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {

	List<T> mList;
	int index = 0;

	public ListIterator(List<T> list) {
		mList = list;
	}

	@Override
	public boolean hasNext() {
		return index != mList.size();
	}

	@Override
	public T next() {
		return mList.get(index++);
	}

	@Override
	public void moveToFirst() {
		index = 0;
	}

	@Override
	public void moveToLast() {
		index = mList.size() - 1;
	}

}

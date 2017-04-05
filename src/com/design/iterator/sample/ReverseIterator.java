package com.design.iterator.sample;

import java.util.List;

public class ReverseIterator<T> implements Iterator<T> {

	List<T> mList;
	int index;
	
	public ReverseIterator(List<T> list) {
		mList = list;
	}
	
	@Override
	public void moveToFirst() {
		index = mList.size() - 1;
	}

	@Override
	public void moveToLast() {
		index = 0;
	}

	@Override
	public boolean hasNext() {
		return index >= 0;
	}

	@Override
	public T next() {
		return mList.get(index --);
	}

}

package com.design.iterator.define;

import java.util.List;



public class ConcreteIterator<T> implements Iterator<T> {

	List<T> mList;
	int cursor;
	
	public ConcreteIterator(List<T> list) {
		mList = list;
	}
	
	@Override
	public boolean hasNext() {
		return cursor != mList.size();
	}

	@Override
	public T next() {
		return mList.get(cursor ++);
	}

}

package com.design.iterator.define;

import java.util.ArrayList;
import java.util.List;

public class ConcreateAggregate<T> implements Aggregate<T> {

	List<T> mList = new ArrayList<T>();
	@Override
	public void add(T t) {
		mList.add(t);
	}

	@Override
	public T remove(int i) {
		return mList.remove(i);
	}

	@Override
	public Iterator<T> iterator() {
		return new ConcreteIterator<T>(mList);
	}

}

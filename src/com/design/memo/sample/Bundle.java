package com.design.memo.sample;

import java.util.HashMap;
import java.util.Map;

public class Bundle {
	Map<Integer, Object> map = new HashMap<Integer, Object>();
	
	public void put(int key,Object value) {
		map.put(key, value);
	}
	
	public Object get(int key) {
		return map.get(key);
	}
}

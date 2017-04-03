package com.design.flyweight.define;

import java.util.HashMap;
import java.util.Map;


public class FlyWeightFactory {
	Map<String, FlyWeight> mFlyWeightMap = new HashMap<>();
	
	public FlyWeight getFlyWeight(String initrinsic){
		FlyWeight flyWeight = mFlyWeightMap.get(initrinsic);
		
		if(null == flyWeight) {
			flyWeight = new ConcreteFlyWeight(initrinsic);
			mFlyWeightMap.put(initrinsic, flyWeight);
			System.out.println(this.getClass().getSimpleName() + " getFlyWeight create a new flyweight");
		}else{
			System.out.println(this.getClass().getSimpleName() + " getFlyWeight from cache");
		}
		
		return flyWeight;
	}
}

package com.design.adapter.sample;

public class VolteAdpater extends Volte220 implements Volte5 {

	@Override
	public int getVolte5() {
		return getVolte220() - 215;
	}

}

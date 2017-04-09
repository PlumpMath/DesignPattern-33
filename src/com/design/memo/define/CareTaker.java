package com.design.memo.define;

public class CareTaker {
	Memoto memoto;
	
	public Memoto restoreMemoto() {
		System.out.println("restore memoto");
		return memoto;
	}
	
	public void storeMemoto(Memoto memoto) {
		System.out.println("store memoto");
		this.memoto = memoto;
	}
}

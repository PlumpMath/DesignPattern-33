package com.design.memo.define;

public class Originator {
	int state;
	
	public void restoreMemoto(Memoto memoto) {
		state = memoto.state;
	}
	
	public Memoto createMemoto() {
		Memoto memoto = new Memoto();
		memoto.setState(state);
		return memoto;
	}
	
	public void doWork() {
		state = 0;
		
		for(int i = 0;i < 100;i ++) {
			state = (state + 5) | 100 & 0b01010101;
		}
	}
	
	public Memoto stopWork() {
		System.out.println("stop work, state = " + state);
		return createMemoto();
	}
	
	public void resumeWork(Memoto memoto) {
		restoreMemoto(memoto);
		System.out.println("resume work, state = " + state);
	}
	
}

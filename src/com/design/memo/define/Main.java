package com.design.memo.define;

public class Main {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.doWork();
		CareTaker careTaker = new CareTaker();
		careTaker.storeMemoto(originator.stopWork());
		originator.resumeWork(careTaker.restoreMemoto());
	}

}

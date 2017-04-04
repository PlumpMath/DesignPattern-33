package com.design.mediator.sample;

public class SoundCard extends Colleague {

	public SoundCard(Mediator mediator) {
		super(mediator);
	}

	public void playSound(String data) {
		System.out.println("play sound data : " + data);
	}

}

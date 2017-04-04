package com.design.mediator.sample;

public class GraphicsCard extends Colleague {

	public GraphicsCard(Mediator mediator) {
		super(mediator);
	}
	
	public void playVideo(String data) {
		System.out.println("play video data : "  + data);
	}

}

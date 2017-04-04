package com.design.mediator.sample;

public class CPU extends Colleague {

	String dataVideo,dataSound;
	
	public CPU(Mediator mediator) {
		super(mediator);
	}
	
	public void decodeData(String data){
		
		String[] datas = data.split(",");
		dataVideo = datas[0];
		dataSound = datas[1];
		
		mediator.change(this);
	}
	
	public String getDataVideo() {
		return dataVideo;
	}
	public String getDataSound() {
		return dataSound;
	}
	
	

}

package com.design.mediator.sample;

public class Main {

	public static void main(String[] args) {
		
		MainBoard mainBoard = new MainBoard();
		CPU cpu = new CPU(mainBoard);
		CDDevice cdDevice = new CDDevice(mainBoard);
		GraphicsCard graphicsCard = new GraphicsCard(mainBoard);
		SoundCard soundCard = new SoundCard(mainBoard);
		
		mainBoard.setCDDevice(cdDevice);
		mainBoard.setCPU(cpu);
		mainBoard.setGraphicsCard(graphicsCard);
		mainBoard.setSoundCard(soundCard);
		
		cdDevice.load();
		
	}

}

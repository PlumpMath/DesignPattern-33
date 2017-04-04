package com.design.mediator.sample;

public class MainBoard implements Mediator {

	CDDevice mCDDevice;
	CPU mCPU;
	GraphicsCard mGraphicsCard;
	SoundCard mSoundCard;

	@Override
	public void change(Colleague colleague) {
		if (colleague == mCDDevice) {
			handleCD((CDDevice) colleague);
		} else if (colleague == mCPU) {
			handleCPU((CPU) colleague);
		}

	}

	private void handleCD(CDDevice cdDevice) {

		mCPU.decodeData(cdDevice.readData());
	}

	private void handleCPU(CPU cpu) {
		mGraphicsCard.playVideo(cpu.getDataVideo());
		mSoundCard.playSound(cpu.getDataSound());
	}

	public void setCDDevice(CDDevice mCDDevice) {
		this.mCDDevice = mCDDevice;
	}

	public void setCPU(CPU mCPU) {
		this.mCPU = mCPU;
	}

	public void setGraphicsCard(GraphicsCard mGraphicsCard) {
		this.mGraphicsCard = mGraphicsCard;
	}

	public void setSoundCard(SoundCard mSoundCard) {
		this.mSoundCard = mSoundCard;
	}

}

package com.design.flyweight.sample;

public class TrainTicket extends Ticket{
	public TrainTicket(ObjectPool objectPool) {
		super(objectPool);
	}

	int carcompomentNumber;
	int seatNumber;
	
	@Override
	public String toString() {
		
		return super.toString() + "; carcompomentNumber : " + carcompomentNumber + "; seatNumber : " + seatNumber;
	}
}

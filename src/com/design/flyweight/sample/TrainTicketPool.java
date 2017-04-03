package com.design.flyweight.sample;

public class TrainTicketPool extends ObjectPool{

	@Override
	protected ObjectUnit createNewObjectUnit() {
		TrainTicket trainTicket = new TrainTicket(this);
		return trainTicket;
	}

}

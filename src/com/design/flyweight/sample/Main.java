package com.design.flyweight.sample;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	TrainTicketPool mTrainTicketPool = new TrainTicketPool();
	Random random = new Random(System.currentTimeMillis());
	String[] trainStation = new String[]{"beijing","changsha","shenzhen","shanghai","chongqi"};
	
	public static void main(String[] args) {
		
		new Main().run();
	}
	
	void run() {
		ExecutorService executorService = Executors.newFixedThreadPool(60);
		
		while (true) {
			executorService.execute(new BuyTicket());
		}
	}
	class BuyTicket implements Runnable{

		

		@Override
		public void run() {
			
			TrainTicket trainTicket = (TrainTicket) mTrainTicketPool.obtain();	
			
			
			int from = random.nextInt(trainStation.length);			
			trainTicket.from = trainStation[from];
			
			int to = random.nextInt(trainStation.length);
			trainTicket.to = trainStation[to];
			
			trainTicket.price = random.nextInt(1000);
			trainTicket.carcompomentNumber = random.nextInt(20);
			trainTicket.seatNumber = random.nextInt(120);
			
			System.out.println(Thread.currentThread().getName() + ";TrainTicket : " + trainTicket);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			trainTicket.recycle();
			
		}
		
	}

}

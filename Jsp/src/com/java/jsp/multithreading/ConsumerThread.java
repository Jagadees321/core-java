package com.java.jsp.multithreading;

public class ConsumerThread implements Runnable {
	int n;

	public ConsumerThread(int n) {
		super();
		this.n = n;
		new Thread(this).start();
		
	}

	@Override
	public void run() {
		System.out.println("consumer thread starts ");
		Stock.getObject().consume(n);
		
	}
	

}

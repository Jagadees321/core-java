package com.java.jsp.multithreading;

public class Stocktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stock.getObject();
		
		new ConsumerThread(10);
		try {Thread.sleep(1000);}catch(Exception e) {};
		new ConsumerThread(5);
		new ConsumerThread(15);
		try {Thread.sleep(2000);}catch(Exception e) {};
		new UpdateThread(25);
		
	}

}

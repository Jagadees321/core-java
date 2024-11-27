package com.java.jsp.multithreading;

public class A1 extends Thread {
	
	
	public static final String c = null;

	public void run() {
		Thread.currentThread();
		for(int i=0;i<=5;i++) {
			System.out.println("A1 = "+i);
			try {Thread.sleep(1000);} catch (Exception e) {};	
		}
	}
}

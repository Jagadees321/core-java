package com.java.jsp.multithreading;

public class B1 extends Thread{
	static A1 c;
	public void run() {
		try {
			c.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		for(char c='a';c<='e';c++) {
			System.out.println("B1 = "+c);
			try {Thread.sleep(1000);} catch (Exception e) {};
		}
		
	}
}

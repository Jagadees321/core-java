package com.java.jsp.multithreading;

public class C1 {
	
	public static void main(String[] args) throws InterruptedException {
		A1 t1=new A1();
		Thread t2=new B1();
		t1.start();
		//t1.start();
		//t2.start();
		//A1.c.start();
		
		for(int i=0;i<=5;i++) {
			System.out.println("main = "+i);
			try {Thread.sleep(1000);} catch (Exception e) {};	
		}
	}
}

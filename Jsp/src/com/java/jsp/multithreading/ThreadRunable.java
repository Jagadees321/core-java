package com.java.jsp.multithreading;

public class ThreadRunable {

	public static void main(String[] args) {
		Runnable r= new Printnum();
		Thread t=new Thread(r);
		t.start();
		Runnable r1= new chars();
		Thread t1=new Thread(r1);
		t1.start();

	}

}
class Printnum implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=30;i++) {
			System.out.println(i);
			try {Thread.sleep(100);} catch (Exception e) {};	
		}
		
	}
	
}
class chars implements Runnable{

	@Override
	public void run() {
		for(char c='a';c<='z';c++) {
			System.out.println(c);
			try {Thread.sleep(110);} catch (Exception e) {};
		}
		
	}
	
}


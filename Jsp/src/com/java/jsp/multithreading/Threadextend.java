package com.java.jsp.multithreading;

public class Threadextend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		Thread t=new Printnums();
		t.start();
		for(char c='a';c<='z';c++) {
			System.out.println(c);
			try {Thread.sleep(110);} catch (Exception e) {};
		}

	}

}
class Printnums extends Thread{
	public void run() {
		for(int i=0;i<=30;i++) {
			System.out.println(i);
			try {Thread.sleep(100);} catch (Exception e) {};	
		}
	}
}

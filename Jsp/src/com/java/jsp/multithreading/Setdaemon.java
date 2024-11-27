package com.java.jsp.multithreading;

public class Setdaemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(new A());
		t.setDaemon(true);
		t.start();
		
		for(char c='a';c<='z';c++) {
			System.out.println(c);
			try {Thread.sleep(110);} catch (Exception e) {};
		}

	}

}

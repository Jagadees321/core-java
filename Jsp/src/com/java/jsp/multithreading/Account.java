package com.java.jsp.multithreading;

public class Account {

	private int bal;
	synchronized public void deposit(int a) {
		int cb=bal;
		int nb=cb+a;
		try {Thread.sleep(100);}catch(Exception e) {};
		bal=nb;
	}
	public int getBal() {
		return bal;
	}
}

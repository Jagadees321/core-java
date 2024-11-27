package com.java.jsp.multithreading;

public class Depositthread implements Runnable{
    
	Account a;
	int amt;
	
	
	public Depositthread(Account a, int amt) {
		super();
		this.a = a;
		this.amt = amt;
		new Thread(this).start();
	}


	@Override
	public void run() {
		a.deposit(amt);
		System.out.println(amt+"  deposited");
		
	}

	

}

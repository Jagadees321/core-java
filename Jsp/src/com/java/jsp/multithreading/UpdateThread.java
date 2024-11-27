package com.java.jsp.multithreading;

public class UpdateThread implements Runnable {
    
	int n;
	UpdateThread(int n){
		
		this.n=n;
		new Thread(this).start();
		
	}
	
	
	@Override
	public void run() {
		System.out.println("update thread starts");
		Stock.getObject().update(n);
		
	}

	

}

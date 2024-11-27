package com.java.jsp.multithreading;

public class Stock {
	int stock;
	private static Stock obj=null;
	private Stock() {
		
	}
	public static Stock getObject() {
		if(obj==null) obj=new Stock();
		return obj;
	}
	synchronized public void update(int n) {
		stock+=n; 
		System.out.println("stocks updated to "+stock);
		notifyAll();
	}
	synchronized public void consume(int n) {
		System.out.println("consumer thread starts");
		while(stock<n) {
			System.out.println("stocks are less, wait for updation");
			try {wait();}catch(Exception e) {};
		}
		stock-=n;
		System.out.println(n+" items consumed");
		
	}

}

package com.java.jsp.multithreading;

public class Acctest {

	public static void main(String[] args) {
		Account a=new Account();
		new Depositthread(a,1000);
		new Depositthread(a,1000);
		try {Thread.sleep(1010);}catch(Exception e) {};
		System.out.println("crt bAL "+a.getBal());
		
		new Depositthread(a,1000);
		//new ConsumerThread(500);
		try {Thread.sleep(1000);}catch(Exception e) {};
		System.out.println("crt bAL "+a.getBal());
		

	}

}

package com.java.jsp.multithreading;

public class A implements Runnable {
    
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=1;
		while(true) {
			System.out.println(i++);
			try {Thread.sleep(100);}catch(Exception e) {};
			
		}

	}

}

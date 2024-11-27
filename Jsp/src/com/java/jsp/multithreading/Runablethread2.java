package com.java.jsp.multithreading;

public class Runablethread2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r2=new Printnum1();
		Runnable r4=new Chars1();
	}

}
class Printnum1 implements Runnable{
	
	Printnum1(){
		new Thread(this).start();
	}
	@Override
	public void run() {
		for(int i=0;i<=30;i++) {
			System.out.println(i);
			try {Thread.sleep(100);} catch (Exception e) {};	
		}
		
	}
	
}
class Chars1 implements Runnable{
	
	Chars1(){
		new Thread(this).start();
	}
	@Override
	public void run() {
		for(char c='a';c<='z';c++) {
			System.out.println(c);
			try {Thread.sleep(110);} catch (Exception e) {};
		}
		
	}
	
}

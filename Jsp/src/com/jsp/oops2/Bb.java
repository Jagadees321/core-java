package com.jsp.oops2;

public  class Bb extends Aa {

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("i am implemented method m2 i am in class Bb");
	}
	public static void main(String[] args) {
		Aa a=new Bb();
		a.m2();
		a.m1();
	}

	
     
}

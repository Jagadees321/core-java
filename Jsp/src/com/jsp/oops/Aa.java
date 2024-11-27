package com.jsp.oops;

public class Aa implements A1 {

	@Override
	public void m1() {
		System.out.println("i am m1");
		
	}
	public static void main(String[] args) {
		Aa a=new Aa();
		a.m1();
		a.m2();
	}
}

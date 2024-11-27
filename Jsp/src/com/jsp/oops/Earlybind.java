package com.jsp.oops;

public class Earlybind 
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a=new B();
		a.m1();
		A.m1();
		

	}
}
class A{
	
	 static void m1() {
		System.out.println("a in m1");
		
	}
	
		
	
}
class B extends A{
	
    static void m1() {
		System.out.println("b in m1");
	}
}

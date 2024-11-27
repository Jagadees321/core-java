package com.jsp.Innerclass;

public class Outer1 {
	void m2() {
		System.out.println();
	}
	class Inner{
		void m1() {
			System.out.println("i am inner");
		}
		static int a=9;

		
	}
	void m3() {
		System.out.println("i am outer");
	}
	public static void main(String[] args) {
//		Outer1.Inner ii=new Outer1().new Inner();
//		Outer1 o=new Outer1();
//		oi.m1();
//		o.m3();
		System.out.println(Inner.a);
	}
}

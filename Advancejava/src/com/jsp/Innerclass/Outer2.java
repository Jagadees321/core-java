package com.jsp.Innerclass;

public class Outer2 {
	int a=9;
	
	static class inner{
		void m1(){
			System.out.println("i am m1");
		}
		public static void main(String[] args) {
			inner n=new inner();
			n.m1();
			Outer2 o=new Outer2();
			System.out.println(o.a);
		}
	}

}

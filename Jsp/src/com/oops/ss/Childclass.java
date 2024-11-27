package com.oops.ss;

public class Childclass extends Parentclass {
	//int a=8;


	void m2() {
		System.out.println("m2 method  "+a);
	}
	
	
	
	
	public static void main(String[] args) {
		Childclass childobj=new Childclass();
		Parentclass pc=new Parentclass();
        childobj.m2();





	}

}

package com.oops.ss;

public class Abc {

	int a;
	int b;
	Abc(int a, int b) {
		
		this.a = a;
		this.b = b;
	}
	Abc(Abc a){
		
	}

	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc c=new Abc(2,6);
		System.out.println(c);
		System.out.println(c.a);
		System.out.println(c.b);
		Abc a=new Abc(c);
		System.out.println(a.a);
		System.out.println(a.b);
	}

}

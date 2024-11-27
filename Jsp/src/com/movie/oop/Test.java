package com.movie.oop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap e =new Encap();
		B a=new B();
		System.out.println(e.getI(a));
		e.setI(a, 6);
		System.out.println(e.getI(a));
		
		

	}

}

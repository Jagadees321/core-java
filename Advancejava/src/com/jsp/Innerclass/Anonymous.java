package com.jsp.Innerclass;

public class Anonymous  {
	public static void main(String[] args) {
		Anonymous a=new Anonymous();
		J j=new J(){
			public void m1(){
				System.out.println("i implemeneted m1");
			}
		};
		j.m1();
	}

	

}

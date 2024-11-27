package com.jsp;


public class Fibb {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int n=9;
		int c;
		if(n==0 || n==1) {
			System.out.println("belongs");
		}
		for( ; ; ) {
			c=a+b;
			if(c==n) {
				System.out.println(" belongs");
				break;
			}
			if(c>n) {
				System.out.println("not belongs");
				break;
			}
			a=b;
			b=c;
		}
		

	}

}

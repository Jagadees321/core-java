package com.jsp;

public class Fibbrange {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int l=5;
		int h=200;
		int c;
		if(l==0) {
			System.out.println("0");
			
		}
		if(l==1)
		{
			System.out.println("0 1");
			
		}
		for( ; ; )
		{
			c=a+b;//5
			if(c>h)
			{
				break;
			}
			if(c>=l) {
				System.out.println(c);
			}
			a=b;//2
			b=c;//3
		}
	}

}

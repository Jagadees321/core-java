package com.oops.ss;

public class Overloading {

	public static void main(String[] args) 
	{
		
      int a=add(5,4);
      System.out.println(a);
	}
	
	public static int add(int a,int b) 
	{
		return a+b;
	}
	public static double add(double a,int b)
	{
		return a+b;
	}

}

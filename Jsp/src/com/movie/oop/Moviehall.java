package com.movie.oop;

public class Moviehall {
	private int seats=50;
	private static Moviehall ref=null;
	private Moviehall(){
		
	}
	public static Moviehall getobject() {
		if(ref==null) ref=new Moviehall();
		return ref;
	}
	
	public void reserveseats(int n)
	{
		System.out.println("no.of seats availble=="+seats);
		if(n>seats)
		{
			System.out.println("seats not availble");
			return ;
		}
		else {
			System.out.println("no of seats booked = "+n);
		}
		seats-=n;
		System.out.println("still avaible seats"+seats);
	}


}

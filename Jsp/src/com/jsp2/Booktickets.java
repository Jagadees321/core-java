package com.jsp2;

import java.util.Scanner;

public class Booktickets {
	
	public static void booktickets() {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		Moviehall m1=Moviehall.getobject();
		m1.reserveseats(t);
		s.close();
		
	}
	
	
	
}

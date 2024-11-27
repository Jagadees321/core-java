package com.movie.oop;

import java.util.Scanner;

import com.jsp2.Moviehall;

public class Booktickets {
	static void booktickets() {
		try (Scanner s = new Scanner(System.in)) {
			int t=s.nextInt();
			Moviehall m1=Moviehall.getobject();
			m1.reserveseats(t);
			s.close();
		}
		
	}
	
}

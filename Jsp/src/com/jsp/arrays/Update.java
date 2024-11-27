package com.jsp.arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		ListIterator<Integer> l=a.listIterator();
		while(l.hasNext()) {
			int b=l.next();
			l.set(b*b);
		}
		for(int v:a) {
			System.out.println(v);
		}
			
		
		
		
		
		
		
		
		

	}

}

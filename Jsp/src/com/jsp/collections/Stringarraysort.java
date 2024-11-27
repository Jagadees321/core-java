package com.jsp.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Stringarraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a= new ArrayList<>();
		a.add("jagga");
		a.add("hari");
		a.add("ajay");
		a.add("raveesh sir");
		a.add("yuvi");
		Collections.sort(a);
		ListIterator<String> b=a.listIterator(a.size());
		while(b.hasPrevious()) {
			System.out.println(b.previous());
		}
	}

}

package com.jsp.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s=new TreeSet<String>();
		s.add("jagga");
		s.add("ava");
		s.add("yuvi");
		s.add("html");
		s.add("css");
		SortedSet<Integer> s1=new TreeSet<Integer>();
		s1.add(1);
		s1.add(4);
		s1.add(3);
		s1.add(4);
		Iterator<Integer> t=s1.iterator();
		while(t.hasNext()) {
			System.out.println(t.next());
		}

	}

}

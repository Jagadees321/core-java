package com.jsp.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Mapdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> p=new HashMap<String, Integer>();
//		System.out.println(p.put("a", 9));
//		System.out.println(p.put("a", 8));
//		System.out.println(p.put("b", 7));
//		System.out.println(p.get("b"));
//		System.out.println(p.size());
		p.put("c", 4);
		p.put("G", 2);
		p.put("e", 5);
		p.put("A", 9);
		Set<String> s=p.keySet();
		Iterator<String> a=s.iterator();
		while(a.hasNext()) {
			Object k=a.next();
			//Object v=p.get(k)
			System.out.println(k+" "+p.get(k));
		}
		
		

	}
}

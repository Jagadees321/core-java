package com.jsp.Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linkedhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m=new LinkedHashMap<Integer, String>();
		m.put(1, "jagga");
		m.put(2, "yuvi");
		m.put(3, "viru");
		m.put(4, "hardhik");
		
		Iterator<Integer> i=m.keySet().iterator();
		while(i.hasNext()) {
			Integer k=i.next();
			String v=m.get(k);
			System.out.println(k+" "+v);
			
		}
	}

}

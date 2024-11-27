package Mapinterfacepre;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<Integer,String>m=new HashMap<>();
		m.put(1, "sehwag");
		m.put(2, "gambhir");
		m.put(3, "yuvi");
		m.put(4, "raina");
		m.put(5, "pant");
		m.put(6, "hardik");
		Map<Integer,String>v=(Map<Integer, String>) m.clone();
		System.out.println(v);
		
		//System.out.println(m);
//		System.out.println(m.containsKey(7));
//		System.out.println(m.containsValue("pant"));
//		System.out.println(m.get(2));
//		System.out.println(m.keySet());
//		System.out.println(m.isEmpty());
//		System.out.println(m.values());
		//System.out.println(m.entrySet());
		List<Integer> l=Arrays.asList(1,3,8,1,8,1,5,5,5,5);
		Map<Integer,Integer>a=new HashMap<>();
		
		for(int c:l) {
			
			if(!a.containsKey(c)) {
				int i=0;
				a.put(c,++i );
				
			}
			else {
				a.put(c, a.get(c)+1);
			}
			
		}
		int max=0;
		int key=0;
		for(Map.Entry<Integer, Integer> c:a.entrySet()) {
			
			if(max<c.getValue()) {
				max=c.getValue();
				
				key=c.getKey();
				
			}
			
		}
		System.out.println(key);
		//System.out.println(max);
		
		
		//System.out.println(a);

	}

}

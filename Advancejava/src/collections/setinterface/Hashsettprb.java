package collections.setinterface;

import java.util.HashSet;

public class Hashsettprb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h=new HashSet<>();
		h.add("jagga");
		h.add("apple");
		h.add("royal");
		h.add("royal");
		h.add(null);
		h.add(null);
		System.out.println(h);
//		h.remove("apple");
//		System.out.println(h);
		h.add("ashwin");
		System.out.println(h);
		for(String s:h) {
			System.out.println(s);
		}
		
		
		

	}

}

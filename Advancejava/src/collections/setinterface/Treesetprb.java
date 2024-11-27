package collections.setinterface;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treesetprb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new TreeSet<>();
		s.add("bab");
		s.add("cbc");
		s.add("cca");
		System.out.println(s);
//		s.remove("cca");
//		System.out.println(s);
		for(String a:s) {
			if(a=="bab") {
				System.out.println("found");
			}
		}
		System.out.println(s.contains("cca"));;
		SortedSet<Integer> s1=new TreeSet<>();
		s1.add(10);
		s1.add(20);
		s1.add(30);
		System.out.println(s1.headSet(39));
		System.out.println(s1);
		//System.out.println(s1.ceiling(15)+"  "+s1.floor(15));
//		int d1=8;
//		int d2=-9;
//        int d=d1>+Math.abs(d2)?d1:Math.abs(d2);
//        System.out.println(d);
		
		
        
        
	}

}

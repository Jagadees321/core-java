package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hashsetprb {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(1);
		s.add(4);
		s.add(5);
		s.add(8);
		s.add(9);
		System.out.println("size ="+s.size());
		s.remove(4);
		System.out.println(s);
		System.out.println(s.contains(87));
		ArrayList<Integer> a=new ArrayList<>();
		a.addAll(s);
		System.out.println(a);
		//s.stream().collect(Collections.groupingby());
		
		
	}

}

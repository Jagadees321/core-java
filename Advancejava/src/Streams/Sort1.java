package Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Sort1 {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(203,407,72,5,1,8,7,9);
		
		//Optional<Integer> a=l.stream().max((e1,e2)->e1.compareTo(e2));
		
		//System.out.println(a.get());
		
		List<Integer> l1=l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println(l1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> a=l.stream().sorted().collect(Collectors.toList());
//        System.out.println(a);
//        
//        System.out.println("reverse with collection");
//        List<Integer> b=l.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
//        System.out.println(b);
//        System.out.println("reverse with comparator");
//        List<Integer> c=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(c);
	}

}

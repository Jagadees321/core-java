package Streams;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

public class Minmax {
	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		Long evencount=a.stream().filter(n->n%2==0).count();
		System.out.println(evencount);
		
		//System.out.println("min");
		Optional<Integer> min=a.stream().min((e1,e2)->e1.compareTo(e2));
		//System.out.println(min.get());
		
		//System.out.println("max");
		Optional<Integer> max=a.stream().max((e1,e2)->e1.compareTo(e2));
		//System.out.println(max.get());
		int res=max.get()-min.get();
		System.out.println(res);
		
		
	}

}

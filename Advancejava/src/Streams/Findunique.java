package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Findunique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,1,2,3,4};
		System.out.println(removeDuplicates(a));

	}
	
	public static int removeDuplicates(int[] a) {
        List<Integer> l=new ArrayList<>();
		for(Integer i:a) {
			l.add(i);
		}
																																																		
		Set<Integer> s=new HashSet<>();
		
		List<Integer> b=new ArrayList<>();
		b=l.stream().filter(e->!s.add(e)).collect(Collectors.toList());
        return s.size();
    }

}

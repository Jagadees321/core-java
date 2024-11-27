package interviewpraparation;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Oddevenfilter {

	public static void main(String[] args) {
		List<Integer> a=Arrays.asList(1,2,4,3,5,6);
       
        List<Integer> even=a.stream().filter(b-> b%2==0).collect(Collectors.toList());
        List<Integer> odd=a.stream().filter(b-> b%2!=0).collect(Collectors.toList());
        System.out.println(even);
        System.out.println(odd);
	}

}

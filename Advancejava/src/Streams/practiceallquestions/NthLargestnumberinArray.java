package Streams.practiceallquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NthLargestnumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {112,22,13,4,35,64,79,83};
		List<Integer> n=Arrays.stream(arr).sorted((a,b)->b-a).collect(Collectors.toList());
		System.out.println("sorted  array "+n);
		Optional<Integer> nthNUM=Arrays.stream(arr).sorted((a,b)->b-a).skip(4).findFirst();
		System.out.println(nthNUM.get());
		

	}

}

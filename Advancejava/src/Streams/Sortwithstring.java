package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sortwithstring {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("bus","car","bycycle","bus","car","bike","plane");
		List<String> a=l.stream().sorted().collect(Collectors.toList());
		System.out.println();
	}

}

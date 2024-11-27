package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dislimcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("bus","car","bycycle","bus","car","bike","plane");
		//distinct 
       List<String>a= l.stream().distinct().collect(Collectors.toList());
       System.out.println(a);
       //count
       Long c=l.stream().distinct().count();
       System.out.println(c);
       List<String>b=l.stream().limit(4).collect(Collectors.toList());
       System.out.println(b);
       
	}

}

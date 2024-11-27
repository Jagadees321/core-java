package interviewpraparation;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grroupingbylength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("i","viru","jagga","yuvi","viru","sehwag","viru");
		Map<Integer,List<String>> l1=l.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(l1);
	
	}

}

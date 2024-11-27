package interviewpraparation;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> a=Arrays.asList("AA","BB","CC","DD","AA","DD");
//        Map<String,Long> m=a.stream().filter(e->Collections.frequency(a, e)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//        System.out.println(m);
        System.out.println(a.stream().filter(e->Collections.frequency(a, e)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        
	}

}

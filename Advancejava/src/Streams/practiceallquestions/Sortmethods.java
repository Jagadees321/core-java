package Streams.practiceallquestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sortmethods {
	public static void main(String[] args) {
	Integer arr[]= {121,32,1,344,15};
		
        List<Integer>sorted=Arrays.stream(arr).sorted().collect(Collectors.toList());
        System.out.println("ascending order"+sorted);
        
        List<Integer>descendingorder=Arrays.stream(arr).sorted((a,b)->b-a).collect(Collectors.toList());
        System.out.println("descending order"+descendingorder);
        
        List<Integer>descendingorder2=Arrays.stream(arr).sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println("2nd-descending order"+descendingorder2);
        
        
	}

}

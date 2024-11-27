package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> s=Arrays.asList("a","b","c","1","3","2");
        Optional<String> reduce=s.stream().reduce((value,acc)->{
        	return acc+value;
        });
        System.out.println(reduce.get());
	}

}

package Streams.practiceallquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<String> arr = Arrays.asList("abc", "def", "hohos");

	        List<String> reversedArr = arr.stream()
	                .map(s -> new StringBuilder(s).reverse().toString())
	                .collect(Collectors.toList());

	        System.out.println(reversedArr);
		

	}

}

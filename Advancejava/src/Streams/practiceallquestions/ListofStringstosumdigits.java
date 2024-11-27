package Streams.practiceallquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListofStringstosumdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arr=Arrays.asList("234","567","984");
		List<Integer> sumofstrings=arr.stream().map(i->i.chars()
				.filter(Character::isDigit)
				.map(Character::getNumericValue)
				.sum()).collect(Collectors.toList());
		
		System.out.println(sumofstrings);

	}

}

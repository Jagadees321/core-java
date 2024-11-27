package Streams.practiceallquestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Intstreampractice {
	public static void main(String[] args) {
		
		List<Integer> primenums=IntStream.rangeClosed(1, 10).filter((n)->{
			if(n<2) return false;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) return false;
			}
			return true;
		}).boxed().collect(Collectors.toList());
		System.out.println(primenums);
		
		
		int sum=IntStream.rangeClosed(1, 10).filter((n)->{
			if(n<2) return false;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) return false;
			}
			return true;
		}).sum();
		System.out.println(sum);
		
	}

}

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=Arrays.asList("bus","car","bycycle","bus","car","bike","plane");
		Optional<String>a=l.stream().findAny();
        System.out.println(a.get());
        Optional<String>b=l.stream().findFirst();
        System.out.println(b.get());
	}

}

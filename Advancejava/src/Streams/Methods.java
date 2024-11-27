package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(98);
		a.add(66);
		a.add(56);
		a.add(77);
		a.add(95);
		a.add(102);
		List<Integer> b=a.stream().filter(n-> n%2==0).collect(Collectors.toList());
		System.out.println(b);
		

	}

}

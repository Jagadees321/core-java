package collections;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Algo {

	private static final List ab = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(2);
		a.add(89);
		a.add(5);
		a.add(65);
		
		a.add(87);
		
		Collections.sort(a);
//		System.out.println(a);
		Collections.shuffle(a);
//		//System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
//		//Collections.fill(a,5);
//		//System.out.println(a);
		Collections.swap(a, 0, 1);
//		System.out.println(a);
		ArrayList<Integer> b=new ArrayList<>();
		Collections.copy(b, a);
		System.out.println(b);
		int p=Collections.binarySearch(a, 3);
		System.out.println(p);
		Collections.frequency(a, b);
		
		

	}

}
package interviewpraparation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Alldivby2java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l=Arrays.asList(2,3,9,5,4,6,8);
		
		List<Integer> l1= l.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(l1);
		boolean res=l.stream().allMatch(n->n%2==0);
		if(res) {
			System.out.println("all divisible by 2");
		}
		else {
			System.out.println("not");
		}

	}

}

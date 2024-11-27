package com.jsp.arrays;

import java.util.Arrays;

public class Arraysfilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6,7,8,9,8,10};
		int sum=Arrays.stream(a).filter(n-> n%2==0 ).sum();
        System.out.println("sum of even numbers = "+sum);
	}

}

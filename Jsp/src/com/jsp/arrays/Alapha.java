package com.jsp.arrays;

import java.util.stream.IntStream;

public class Alapha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		char [] a=new char[26];
//		int b=97;
//		for(int i=0;i<a.length;i++) {
//			a[i]+=b++;
//		}
//		System.out.println(a);
		
		int sum=IntStream.range(0, 3).filter(n->n%2==0).sum();
		System.out.println(sum);
	}

}
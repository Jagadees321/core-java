package com.jsp.arraysSortings;

import java.util.Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []a= {10,5,12,3,7,1,11,13,4,8};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));


	}

	private static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>-1 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		
	}

}

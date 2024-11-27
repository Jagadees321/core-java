package com.jsp.arraysSortings;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		int []a= {10,5,12,3,7,11,13,4,8};
		System.out.println(Arrays.toString(a));
		bubbulesort(a);
		System.out.println(Arrays.toString(a));
		Merge.main(args);
		
		
		
	}
	public static void bubbulesort(int[]a) {
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

	}

}

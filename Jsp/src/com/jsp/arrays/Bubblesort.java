package com.jsp.arrays;

import java.util.Arrays;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]b= {2,7,9,6,0,4};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));

	}
	
	
	public static void sort(int []a) {
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

package com.jsp.arrays;

import java.util.Arrays;

public class Insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {8,7,5,2};
		System.out.println(Arrays.toString(a));
		System.out.println("-------");
		
		sort(a);
		System.out.println(Arrays.toString(a));

		

	}
	public static void sort(int []a) {
		for(int i=1;i<a.length;i++) {
			int key=a[i];
			int j=i-1;
			while(j>-1 && a[j]>key)
			{
				a[j+1]=a[j];
				System.out.println(a[j+1]);
				j--;
			}
			a[j+1]=key;
			
		}
	
		
	}

}

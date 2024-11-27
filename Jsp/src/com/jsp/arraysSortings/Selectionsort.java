package com.jsp.arraysSortings;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		int []a= {10,5,12,3,7,1,11,13,4,8};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));

	}

	private static void sort(int[] a) {
		for(int i=0;i<a.length;i++) {
			int k=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[k]>a[j]) k=j;
			}
			if(i!=k) {
				int temp =a[i];
				a[i]=a[k];
				a[k]=temp;
			}
			
		}
		
	}

}

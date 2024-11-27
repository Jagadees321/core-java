package com.jsp.arraysSortings;

import java.util.Arrays;

public class Quick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {10,5,12,3,7,11,13,4,8};
		System.out.println(Arrays.toString(a));
		
	    quicksort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

	static void quicksort(int[] a,int s,int e) {
		if(s>=e) return;
		int pivot=a[(s+e)/2];
		int i=s;
		int j=e;
		while(i<=j) {
			while(a[i]<pivot) i++;
			while(a[j]>pivot) j--;
			if(i<=j) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			
			
		}
		quicksort(a,s,j);
		quicksort(a,i,e);
		
	}
	

}

package com.jsp.arrays;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {
		
		int[]b= {2,7,9,6,0,4,8};
		
		sort(b);
		System.out.println(Arrays.toString(b));

	}
	public static void sort(int[]a) {
		if(a.length==1) return;
		int[]left=new int[a.length/2];
		int[]right=new int[a.length-left.length];
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);
		sort(left);
		sort(right);
		merge(left,right,a);
		
	}
	public static void merge(int []a,int []b,int []c) {
		int i=0; int k=0;int j=0;
		while(i<a.length && j<b.length) {
			if(a[i]<a[j]) {
				c[k]=a[i];
				k++;
				i++;
			}
			else {
				c[k]=a[j];
				k++;
				j++;
			}
		
		}
		while(i<a.length) c[k++]=a[i++];
		while(j<b.length) c[k++]=b[j++];
		
		
		
	}

}

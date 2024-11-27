package com.jsp.arraysSortings;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[]b= {2,7,9,6,0,4,8};
		
		sort(b);
		System.out.println(Arrays.toString(b));

	}

	private static void sort(int[] a) {
		// TODO Auto-generated method stub
		if(a.length==1)return;
		int []left=new int[a.length/2];
		int []right=new int[a.length-left.length];
		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);
		sort(left);
		sort(right);
		merge(left,right,a);
		
	}

	private static void merge(int[] a, int[] b, int[] c) {
		// TODO Auto-generated method stub
		int i=0; int j=0; int k=0;
		while(i<a.length && j<b.length) {
			if(a[i]>b[j]) {
				c[k]=b[j];
				k++;
				j++;
			}
			else {
				c[k]=a[i];
				i++;
				k++;
			}
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
		
	}

}

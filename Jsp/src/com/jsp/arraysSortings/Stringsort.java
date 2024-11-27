package com.jsp.arraysSortings;

import java.util.Arrays;

public class Stringsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] b= {"jagga","ajay","yuvi","kiran"};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));
	}
	public static void sort(String[] a) {
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j].compareTo(a[j+1])<0) {
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}

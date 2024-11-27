package com.jsp.arrays;

import java.util.Arrays;

public class Selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int []a= {9,3,8,5,7};
		System.out.println(Arrays.toString(a));
		System.out.println("-------");
		
		sort(a);
		System.out.println(Arrays.toString(a));

	}
	public static void sort(int[]a) 
	{
		for(int i=0;i<a.length;i++) 
		{
			int k=i;
			for(int j=i+1;j<a.length;j++) 
			{
				
				if(a[k]>a[j]) k=j;//here we select min value index
				
				
				
			}
			if(i!=k) {
				
				int temp=a[i];
				
				a[i]=a[k];//min value assaiged in order
		
				a[k]=temp;
				
			
			}
			
		}
	}

}

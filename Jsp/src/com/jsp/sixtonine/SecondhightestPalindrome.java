package com.jsp.sixtonine;

import java.util.Scanner;

public class SecondhightestPalindrome {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int h=s.nextInt();
		//boolean n=isPalindrome(252);
		//System.out.println(n);
		int count=0;
		int k=0;
		for(int i=h;i>=l;i--) 
		{
			
			if(isPalindrome(i)) {
				k=i;
				count++;
				System.out.println(k);
				if(count>1)return;
			}		
		}
		s.close();
		//System.out.println(k);		

	}
	public static  boolean isPalindrome(int n) {
		int temp=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		return temp==sum;
	}

}

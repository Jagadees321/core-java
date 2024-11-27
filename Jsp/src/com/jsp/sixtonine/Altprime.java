package com.jsp.sixtonine;

import java.util.Scanner;

public class Altprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int h=s.nextInt();
		//int count=0;
		boolean a=true;
//		for(int i=l;i<=h;i++) {
//			if(isPrime(i)) {
//				count++;
//				if(count%2!=0) {
//					System.out.println(i);
//				}
//			}
//			
//		}
		for(int i=l;i<=h;i++) {
			if(isPrime(i)) 
			{
				if(a) 
				{
				    System.out.println(i);
				    a=false;
			    }
				else {
					a=true;
				}
			}
		}
		s.close();
		

	}
	
    public static boolean isPrime(int n) {
    	if(n<2)return false;
    	for(int i=2;i<=n/2;i++) {
    		if(n%i==0) {
    			return false;
    		}
    		
    	}
    	return true;
    }
}

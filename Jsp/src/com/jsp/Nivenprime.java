package com.jsp;

public class Nivenprime {
	public static void main(String[] args) {
		int n=21;
		int sum=0;
		int temp=n;
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		//System.out.println(sum);
		
		if(temp%sum==0) {
			System.out.println("niven");
		}
		else {
			System.out.println("not niven");
			return;
		}
		
		int p=temp/sum;
		
		if(p<2) {
			System.out.println("not prime");
		}
		for(int i=2;i<=p/2;i++) {
			if(p%i==0) {
				System.out.println("not prime");
				return;
			}
		}
		System.out.println("it is prime"+p);
	}

}

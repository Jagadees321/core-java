package com.jsp;

public class Strongn {

	public static void main(String[] args) {
		int n=145;
//		int tempt=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++) {
				fact*=i;
			}
			System.out.println(fact);
			sum+=fact;
			n/=10;
		}
		System.out.println(sum);
	}

}

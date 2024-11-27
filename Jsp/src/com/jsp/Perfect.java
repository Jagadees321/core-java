package com.jsp;

public class Perfect {

	public static void main(String[] args) {
		int n=28;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

}

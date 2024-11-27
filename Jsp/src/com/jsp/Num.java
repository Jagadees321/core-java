package com.jsp;

public class Num {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k>0;k--) {
				System.out.print(k);
			}
			for(int m=2;m<=i;m++) {
				System.out.print(m);
			}
			System.out.println();
		}
	}

}

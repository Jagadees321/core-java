package com.jsp;

public class Pattern1 {
		public static void main(String[] args) {
			int n=5;
			int s=2*n-2;
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n+1-i;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=2*i-2;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=n+1-i;j++) {
					System.out.print("*");
				}
				
				System.out.println();
			}
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=s;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				s=s-2;
				
				System.out.println();
			}
		
		

	}
	 
}

package com.jsp;

public class Patternp {

	public static void main(String[] args) {
		int n=5;
		int s=2*n-2;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) 
			{   
				System.out.print("*");
		    }
			
			for(int k=1;k<=s;k++) {
				System.out.print(" ");
							
			}
		    for(int a=1;a<=i;a++) {
				System.out.print("*");
			}
		    s=s-2;
			System.out.println();
		}
	}

}

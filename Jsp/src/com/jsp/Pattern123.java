package com.jsp;

public class Pattern123 {
	public static void main(String[] args) {
		int n=5;
		int p=1;
		int k=1;
		int s=2*n-2;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=p;j++) {
				System.out.print("*");	
			}
			if(i<n) {
				p++;
			}
			else {
				p--;
				
			}	
			System.out.println();
		}
		//System.out.println();
	}

}

package com.jsp;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
				
			
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}


	}

}

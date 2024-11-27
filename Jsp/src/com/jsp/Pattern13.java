package com.jsp;

public class Pattern13 {
	public static void main(String[] args) {
		int row=9;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print( " " );
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" *");
				//if(j==1 || j==i || i==row) {
				//	System.out.print(" *");
				//}
				//else {
				//	System.out.print("  ");
				//}
			}
			System.out.println();
		}
	}

}

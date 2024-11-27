package com.jsp.sixtonine.patterns;

public class Revtriangle {

	public static void main(String[] args) {
		int row=9;
		for (int i=1;i<row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("   ");
			}
			for(int k=1;k<=row-i;k++) {
				if(k==1 || k==row-i || i==1) {
					System.out.print("  *  ");
				}
				else {
					System.out.print("     ");
				}
				
			}
			System.out.println();
			
		}
		

	}

}

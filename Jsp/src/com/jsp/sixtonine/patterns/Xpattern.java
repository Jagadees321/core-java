package com.jsp.sixtonine.patterns;

public class Xpattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || i==5 || i==j || i+j==n+1 || j==1 || j==5) {
					System.out.print(" * ");
				}
				else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}

}

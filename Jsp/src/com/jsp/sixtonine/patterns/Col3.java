package com.jsp.sixtonine.patterns;

public class Col3 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int k=i+1;
			for(int j=1;j<=i;j++) {
				if(i==n/2+1) {
					System.out.print(k++);
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}

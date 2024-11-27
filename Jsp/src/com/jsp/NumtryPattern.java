package com.jsp;

public class NumtryPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			int p=i;
			
			for(int j=5;j>=i+1;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				
				System.out.print(p);
				p--;
			}
            for(int a=2;a<=i;a++) {
				
				System.out.print(a);
				;
				
			}
			System.out.println();
		}

	}

}

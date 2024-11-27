package com.jsp;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=5;j++) {
				if(i+j<=n+1) {
					System.out.print(i+""+j+" ");
				}
			}
			System.out.println();
		}

	}

}

package com.jsp;

public class Pattern8 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			int k=5;
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					System.out.print(k-- +" ");
				}
				else {
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
	
	}

}	

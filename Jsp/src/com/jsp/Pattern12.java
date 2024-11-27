package com.jsp;

public class Pattern12 {
	public static void main(String[] args) {
		int n=5;
		int k;
		for(int i=1;i<=n;i++) {
			if(i%2==0) k=n*i;
			else k=n*(i-1)+1;
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					System.out.print(k-- +"\t ");
				}
				else {
					System.out.print(k+++"\t ");
				}
			}
			System.out.println();
		}
	
	}

}

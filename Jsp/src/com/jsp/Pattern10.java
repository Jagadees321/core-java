package com.jsp;

public class Pattern10 {
	public static void main(String[] args) {
		int n=5;
		
		for(int i=1;i<5;i++) {
			int k=5;
			for(int j=n;j>=i;j--) {
				System.out.print(k--+" * ");
			
			}
			System.out.println();
		}
	}

}

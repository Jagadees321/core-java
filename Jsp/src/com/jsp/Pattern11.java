package com.jsp;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        //int k=1;
		
		for(int i=1;i<=5;i++) {
			//int k=5;
			for(int j=n;j>=i;j--) {
				if(i==j) {
					System.out.print(j);
					
				}
				else {
					System.out.print(j +" * ");
				}
				
			
			}
			System.out.println();
		}

	}

}

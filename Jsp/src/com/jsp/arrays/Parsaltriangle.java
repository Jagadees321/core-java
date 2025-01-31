package com.jsp.arrays;



import java.util.Scanner;

public class Parsaltriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		
		int[][]a=parsal(n);
		int s=n-1;
		
		for(int i=0;i<a.length;i++) {
			for(int j=s;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<a[i].length;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
			s--;
		}
		s1.close();
		
	}
	public static int[][] parsal(int n){
		int[][]a=new int[n][];
		for(int i=0;i<a.length;i++) {
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++) {
				if(j==0 || j==a[i].length-1) {
					a[i][j]=1;
				}
				else {
					a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		return a;
		
	}

}

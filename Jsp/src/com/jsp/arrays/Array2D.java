package com.jsp.arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter rows");
		int rows=s.nextInt();
		int[][]a=new int[rows][];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter columns");
			int col=s.nextInt();
			a[i]=new int[col];
			System.out.println("enter   3"+i+" row "+col+" elements");
			for(int j=0; j<a[i].length;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("elements entered");
		for(int[] x:a) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		s.close();

	}

}

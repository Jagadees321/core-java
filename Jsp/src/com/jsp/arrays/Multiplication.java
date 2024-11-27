package com.jsp.arrays;

import java.util.Arrays;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]b= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]c=new int[a.length][b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				for(int k=0;k<c.length;k++) {
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int[]a1:c) {
//			for(int y:a1) {
//				System.out.println(y);
//			}
			System.out.println(Arrays.toString(a1));
		}

	}

}

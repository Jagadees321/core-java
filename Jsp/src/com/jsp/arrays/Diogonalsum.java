package com.jsp.arrays;

public class Diogonalsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				if(i==j) sum+=a[i][j];
				//if(i+j==a.length-1)sum+=a[i][j];
				if(i+j==a.length-1 && i!=j)sum+=a[i][j];
			}
		}
		System.out.println(sum);

	}

}

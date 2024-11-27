package com.jsp.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Ademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int []a=new int[8];
		int[][] a= {{1,0},{0,0}};
		System.out.println(repeatedRows(a, 2, 2));

	}
	 public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
	    {
	        //code here
	        ArrayList<Integer> ai=new ArrayList<>();
	        for(int i=0;i<matrix.length-1;i++){
	            for(int j=i+1;j<matrix.length;j++){
	            	
	                if(iseqaularray(matrix[i],matrix[j])){
	                    ai.add(i);
	                }
	            }
	        }
	        return ai;
	    }
	 
	 public static boolean iseqaularray(int[]a,int[]b) {
		 for(int a1:a) {
			 for(int b1:b) {
				 if(a1!=b1) {
					return false; 
				 }
			 }
		 }
		 return true;
	 }

}

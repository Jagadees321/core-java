package com.jsp.exceptions;

public class Arraysexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,6,7,4,8};
		try {
		System.out.println(a[7]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getStackTrace();
			System.out.print(e.getMessage());
		}
	}

}

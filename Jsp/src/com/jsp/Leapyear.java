package com.jsp;

public class Leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=2024;
		if(y%400==0 || (y%4==0 && y%100!=0)) {
			System.out.println("leap");
		}
		else {
			System.out.println("not");
		}

	}

}

package com.jsp.exceptions;

public class Numformatexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n="acx887";
		int a=0;
		try {
		a=Integer.parseInt(n);
		
		System.out.println(a);
		}catch(NumberFormatException e){
			System.out.println("handled");
		}

	}

}

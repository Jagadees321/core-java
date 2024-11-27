package com.jsp.strings;

public class Reverse {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println(reverse("jagadeesh"));
		

	}
	public static String reverse(String s) {
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);
		}
		return s2;
		
	}

}

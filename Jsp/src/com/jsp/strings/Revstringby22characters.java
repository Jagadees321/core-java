package com.jsp.strings;

public class Revstringby22characters {

	public static void main(String[] args) {
		String s="jagadeesh";
		System.out.println(tworev(s));
		

	}
	public static String tworev(String s) {
		int a=0;
		int b=s.length();
		String s1="";
		while(a<b) {
			String temp="";
			for(int i=0;i<2 && a<b;i++) {
				char c=s.charAt(a);
				temp+=""+c;
				temp=rev(temp);
				a++;
			}
			s1+=temp;
			
		}
		return s1;
	}
	
	public static String rev(String s) {
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			char c=s.charAt(i);
			temp+=""+c;
		}
		return temp;
	}

}
package com.jsp.strings;

public class rotateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcde";
		char[]a=s1.toCharArray();
		int d=3;
		String s2="";
		for(int i=d;i<a.length;i++) {
			s2+=a[i];
		}
		for(int i=0;i<d;i++) {
			s2+=a[i];
		}
		System.out.println(s2);

	}

}

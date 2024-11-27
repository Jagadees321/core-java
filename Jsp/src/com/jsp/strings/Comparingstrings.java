package com.jsp.strings;
public class Comparingstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2=new String("abc");
		String s3="abc";
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		

	}

}

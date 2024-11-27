package com.jsp.strings;

public class Stringrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		String s2="";
		String s3="";
		int m=s.length()/2;
		char[]a=s.toCharArray();
		//System.out.println(a[m]);
		for(int i=0;i<m;i++) {
			s2+=""+a[i];
			
		}
		for(int i=m+1;i<s.length();i++) {
			s3+=""+a[i];
			
		}
		String s4=s3+a[m]+s2;
		System.out.println(s4);

	}

}

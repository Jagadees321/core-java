package com.jsp.strings;

public class Missingalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jagadeesh";
		String s2="abcdefghijklmnopqrstuvwxyz";
		String s3="";
		for(int i=0;i<=s2.length()-1;i++) {
			char a=s2.charAt(i);
			if(s1.indexOf(a)==-1) {
				//System.out.println((i));
				s3+=a;
				
			}
		}
		System.out.println(s3);
		
				

	}

}

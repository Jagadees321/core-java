package com.jsp.strings;

public class Replacewithoutbuiltin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java";
		char[]a=s1.toCharArray();
		String s2="";
		for(int i=0;i<a.length;i++) {
			if(a[i]=='a')
			{
				s2+="";
				
			}
			else {
				s2+=a[i];
			}
		}
		System.out.println(s2);

	}

}

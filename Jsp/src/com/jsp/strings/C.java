package com.jsp.strings;

import java.util.Arrays;

public class C 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="i like java";
		String[]s1=s.split(" ");
		String s2="";
		System.out.println(Arrays.toString(s1));
		for(int i=0;i<s1.length;i++) {
			String temp="";
			for(int j=0;j<s1[i].length();j++) {
				if(j==0) {
					temp+=(s1[i].charAt(j));
					temp=temp.toUpperCase();
					
				}else {
					temp+=s1[i].charAt(j);
				}
				
			}
			s2+=temp+" ";
			
		}
		System.out.println(s2);
		
	}
}

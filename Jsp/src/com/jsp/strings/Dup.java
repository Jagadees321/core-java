package com.jsp.strings;

public class Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabcabcdev";
		String temp="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(temp.indexOf(ch)==-1) {
				temp+=ch;
			}
		//System.out.println(temp);	
		}
        System.out.println(temp);
	}

}

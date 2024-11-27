package com.jsp.strings;

public class Countgivenstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jagadeesh";
		//String temp="a";
		char temp='a';
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==temp) {
				count++;
			
			}
		//System.out.println(temp);	
		}
        System.out.println(count);

	}

}

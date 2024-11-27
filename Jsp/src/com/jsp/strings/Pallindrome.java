package com.jsp.strings;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="malayalam";
		System.out.println(matchedpallindrome(s,2));

	}
	static boolean ispallindrome(String s) {
		char[]a=s.toCharArray();
		int i=0;int j=s.length()-1;
		while(i<j) {
			if(a[i]!=a[j])return false;
			i++;
			j--;
		}
		return true;
	}
	static String matchedpallindrome(String s,int n) {
		int k=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+2;j<s.length();j++) {
				
				if(ispallindrome(s.substring(i, j))) {
					k++;
					if(k==n) {
						return s.substring(i, j);
					}
				}
			}
		}
		return "";
	}
	
	

}

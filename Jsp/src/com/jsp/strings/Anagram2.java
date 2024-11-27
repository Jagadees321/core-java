package com.jsp.strings;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java";
		String s1="avaj";
		if(anagram(s,s1)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("false");
		}
		
			
		
	}
	public static boolean anagram(String s1,String s2) {
		
			while(s1.length()>0 && s2.length()>0) {
				if(s1.length()!=s2.length()) return false;
				
				char c=s1.charAt(0);
				s1=s1.replace(c+"" ,"");
				s2=s2.replace(c+"", "");
				if(s1.length()==s2.length()) continue;
				
			}
			return true;
				
		
	}

}

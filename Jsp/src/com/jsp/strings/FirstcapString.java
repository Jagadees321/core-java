package com.jsp.strings;

public class FirstcapString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="java is easy";
		String[]a=s1.split(" ");
		String s2="";
		for(int i=0;i<a.length;i++) {
			s2+=cap(a[i]);
			s2+=" ";
		}
		s2=s2.trim();
		System.out.println(s2);
				

	}
	static String cap(String s) {
		String s1="";
		
		for(int i=0;i<=(s.length())-1;i++)
		{
			
			if(i==0) {
				s1 +=s.charAt(i);
				s1=s1.toUpperCase();
			}
			else {
				s1 +=s.charAt(i);
			}
			
		
	    }
		return s1;
	}

	

}
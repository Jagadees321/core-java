package com.jsp.strings;

public class Firstcapwithoutinbulit {

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
		char[]a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			
			if(i==0) {
				s1 +=a[i];
				//System.out.println(s1);
				char b=s1.charAt(0);
				if(b>='a' && b<='z') {
					char s2= (char)(b-32);
					s1=""+s2;
					//System.out.println(s1);
				}
					
				
		    }
			else {
				s1 +=s.charAt(i);
			}
			
		
	    }
		return s1;

	}
	
}

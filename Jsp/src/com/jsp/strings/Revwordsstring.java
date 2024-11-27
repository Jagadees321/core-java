package com.jsp.strings;

public class Revwordsstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="yuvi is hero";
		char[]a=s1.toCharArray();
		String s2="";
		int i=s1.length()-1; int j=s1.length()-1;
		while(i>-1) {
			while(i>-1 && a[i]!=' ') {
				i--;	
			}
			int k=i+1;
			String temp="";
			while(k<=j) {
			    
			    	temp+=a[k];
				    k++;
				
				
			}
			s2+=temp;
			if(i>-1) s2+=" ";
			i--;
			j=i;
		}
		s2=s2.trim();
		System.out.println(s2);

	}

}

package com.jsp.strings;

public class Stringrotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="banana";
		int d=5;
		
		char[]a=s.toCharArray();
		char[]b=s.toCharArray();
		int i=1;
		char ch=a[0];
	
		while(i<=d) {
			b[i]=ch;
			b[i-1]=a[i];
			
			i++;
		
		}
		//System.out.println(a);
		System.out.println(b);
		
			
				
				
				
			
		
		
		
		

	}

}

package com.jsp.strings;

public class Stringminindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jgggddftdrrsrdrdrshu";
		String s1="yviua";
		char[]a=s.toCharArray();
		//char[]b=s1.toCharArray();
		int n=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(s1.indexOf(c)!=-1) {
				n=i;
				System.out.println(a[i]);
				break;
				
				
			}
		}
		System.out.println(n);

	}

}

package com.jsp.strings;

public class Leastcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jagadeesh";
		char[]a=s1.toCharArray();
		String s2="";
		char c1 = 0;
		for(int i=0;i<s1.length();i++) {
			int count=0;
			if(s2.indexOf(a[i])==-1) {
				for(int j=0;j<s1.length();j++) {
					if(a[i]==a[j]) {
						c1=a[i];
					  count++;
					  s2+=a[i];
					}
				}
				System.out.println(c1);
				System.out.println("no of occurances of "+a[i]+"  ="+count);
			}
			
		}

	}

}

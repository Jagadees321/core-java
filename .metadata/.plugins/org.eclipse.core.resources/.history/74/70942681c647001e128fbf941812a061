package com.jsp.strings;

public class Permutations {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		permutations("abcd",0,3);
		
	}
	public static void permutations(String s,int start, int end) {
		if(start==end) {
			System.out.println(s);
			return;
		}
		for(int i=start;i<=end;i++) {
			String s1=swap(s,start,i);
			
			permutations(s1,start+1,end);
			
			
			
		}
		
		
		 
		
	}
	public static String swap(String s,int i,int j) {
		char[] a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
		
		
	}

	

	

}

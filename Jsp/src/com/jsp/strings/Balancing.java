package com.jsp.strings;

import java.util.Stack;

public class Balancing {

	public static void main(String[] args) {
		String s3="[{()}]";
		System.out.println(isbalancing(s3));
	}
	public static boolean isbalancing(String s) 
	{
		Stack<Character> s1=new Stack<Character>();
		for(int i=0;i<s.length();i++) 
		{
			char c=s.charAt(i);
			
			if(c=='[' || c=='{' || c=='(') 
			{
				s1.push(c);
			}
			else if(c==']' || c=='}' || c==')')
			{
				char c1=s1.pop();
				if(s1.isEmpty() || !pair(c1,c))return false;
				
				
			}
			
		}
		return s1.isEmpty();
	}
		
		public static boolean pair(char c1,char c) 
		{
			if(c1=='[' && c==']') return true;
			if(c1=='{' && c=='}') return true;
			if(c1=='(' && c==')') return true;
			return false;
		}
	

}

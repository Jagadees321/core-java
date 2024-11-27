package com.jsp.strings;

public class Numssum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="gkugkjehdgkjgkj86";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				sum+=(c-'0');
			}
		}
		System.out.println(sum);

	}

}

package com.jsp.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Encryption {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a=new char[26];
		int j=0;
		for(int i=97;i<=122;i++) {
			a[j++]=(char)i;
		}
		System.out.println(Arrays.toString(a));
		System.out.println("enter name");
		String s=new Scanner(System.in).next();
		//System.out.println(s);
		String enc="";
		String d="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			enc+=(char)a[(c-97+3)%26];
			d+=(char)a[(c-97+23)%26];
		}
		System.out.println("encyrpt  ="+enc);
		System.out.println("decrypt  ="+d);

	}

}

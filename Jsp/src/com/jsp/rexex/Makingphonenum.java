package com.jsp.rexex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Makingphonenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		//char c=s1.charAt(0);
		
		Pattern p=Pattern.compile("(0/91)?9[0-9]{9}");
		Matcher m=p.matcher(s1);
		if(m.find()) {
			System.out.println("phone num crt="+s1);
			
		}
		else {
			System.out.println("enter crt num");
		}
		s.close();
			
		

	}

}

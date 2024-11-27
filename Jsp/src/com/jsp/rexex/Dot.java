package com.jsp.rexex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dot {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in)) {
			Pattern p=Pattern.compile("[0-9]{4}");
			Matcher m=p.matcher(s1.nextLine());
			String s = "h";
			while(m.matches()) 
			{
				s=m.group();
				System.out.println(s);
				return;
				
				
				
				
			}
			
		}

	}

}


package com.jsp.rexex;

import java.util.Scanner;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Datevalidation {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String d=new Scanner(System.in).next();
		Pattern p=Pattern.compile("^(0[1-9]|[12][0-9]|3[01])[-][0-1][1-9][-][1-2][0-9]{3}");
		Matcher m=p.matcher(d);
		if(m.matches()) {
			System.out.println("crt date");
		}
		else {
			System.out.println("not crt"+d);
		}
	
	}

}

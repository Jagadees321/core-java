package com.jsp.rexex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		String s=new Scanner(System.in).next();
		Pattern p=Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).{5,25}[@]gmail[.][a-z]{2,6}");
		Matcher m=p.matcher(s);
		if(m.matches()) {
			System.out.println("valid");
		}
		else {
			System.out.println("not valid");
		}

	}

}

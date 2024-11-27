package com.jsp.rexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Num2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("[0-9][0-9]");
		Matcher m=p.matcher("ab43cd7ha98d");
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println("---------");
			
			
		}

	}

}

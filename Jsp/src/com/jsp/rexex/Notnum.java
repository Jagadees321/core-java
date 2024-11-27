package com.jsp.rexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("a[^0-9]");
		Matcher m=p.matcher("ab7cdha9d");
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println("---------");
			
			
		}

	}

}

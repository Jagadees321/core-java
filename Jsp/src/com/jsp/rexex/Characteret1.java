package com.jsp.rexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Characteret1 {

	public static void main(String[] args) {
		
		Pattern p=Pattern.compile("a[ab]");
		Matcher m=p.matcher("abcdhaad");
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
			System.out.println("---------");
			
			
		}

	}

}

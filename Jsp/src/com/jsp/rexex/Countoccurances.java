package com.jsp.rexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Countoccurances {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("([a-z])\\1*");
		Matcher m=p.matcher("aaabccddddg");
		while(m.find()) {
			String s=m.group();
			int i=s.length();
			char c=s.charAt(0);
			System.out.print(" "+c+""+i);
		}

	}

}

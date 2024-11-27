package com.jsp.rexex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantityinfinity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("[a-z]{2,}");
		Matcher m=p.matcher("abc8dhad");
		while(m.find()) {
			System.out.println(m.group());
			System.out.println(m.start());
			System.out.println(m.end());
			
			
			System.out.println("---------");	
		}

	}

}

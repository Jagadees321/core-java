package com.jsp.rexex;
import java.util.regex.*;
//import java.util.Pattern;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("^[ab]");
		Matcher m=p.matcher("jagadeesh");
		if(m.find()) {
			System.out.println("found");
		}
		else {
			System.out.println("not ");
		}
		

	}

}

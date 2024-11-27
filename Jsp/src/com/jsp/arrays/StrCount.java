package com.jsp.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> w=Arrays.asList("apple","banana","apple","Orange","apple");
		long count=w.stream().filter(n-> n.equals("apple")).count();
		System.out.println(count);

	}

}

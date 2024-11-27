package com.jsp2;

import java.util.Scanner;

public class Bintodic {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
		int d=0;
		int n=0;
		while(b>0) {
			int temp=b%10;
			d+=temp*Math.pow(2, n);
			b=b/10;
			n++;
		}
		System.out.println(d);
		s1.close();
	}

}

package com.jsp.sixtonine;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		int temp=n;
		int sq=n*n;
		int d=1;
		while(n>0) {
			d*=10;
			n=n/10;
		}
		
		
		if(temp==sq%d) {
			System.out.println("automarphic");
		}
		else {
			System.out.println("not");
		}
		s1.close();
		
	}

}

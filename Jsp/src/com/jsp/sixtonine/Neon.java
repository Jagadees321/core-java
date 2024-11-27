package com.jsp.sixtonine;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		int sq=n*n;
		while(sq>0) {
			int r=sq%10;
			sum+=r;
			sq=sq/10;
			
			
		}
		if(temp==sum){
			System.out.println("neon");
		}
		else {
			System.out.println("not neon");
		}
		s.close();

	}

}

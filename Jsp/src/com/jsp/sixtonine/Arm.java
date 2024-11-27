package com.jsp.sixtonine;

public class Arm {

	public static void main(String[] args) {
		int n=407;
	//	int len=order(n);
		if(isarm(n,order(n))) {
			System.out.println("arm");
		}
		else {
			System.out.println("not");
		}

	}
	public static int order(int n) {
		int len=0;
		while(n>0) {
			len++;
			n=n/10;
		}
		return len;
	}
	public static boolean isarm(int n,int len) {
		int temp=n;
		int r;
		int arm=0;
		while(n>0) {
			r=n%10;
			arm=arm+(int)Math.pow(r, len);
			n=n/10;
		}
		return temp==arm;
	}

}

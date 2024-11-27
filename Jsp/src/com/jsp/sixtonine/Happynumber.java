package com.jsp.sixtonine;

public class Happynumber {

	
	public static int ishappy(int n) {
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r);
			n=n/10;	
		}
		return sum;
		
	}
	public static boolean happy(int n) {
		int result = n;
		while(result != 1 && result != 4){  
            result= ishappy(result);  
        }  
		if(result==1) {
			return true;
		}
		else {
			return false;
		}
          
         
	}
	public static void main(String[] args) {
		int n=13;
		if(happy(n)) {
			System.out.println("happy");
		}
		else {
			System.out.println("not happy");
		}
	}

}

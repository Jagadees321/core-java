package com.jsp.sixtonine;

public class Largestprime {

	public static void main(String[] args) {
		int l=2;
		int h=100;
		
		int firsth=0;
		int sech=0;
		for(int i=l;i<=h;i++) {
			if(isPrime(i)) {
				if(i>firsth) {
					sech=firsth;
					firsth=i;
					
				}
			}
			
		}
		System.out.println(firsth);
		System.out.println(sech);
		
	}
	 public static boolean isPrime(int n) {
	    	if(n<2)return false;
	    	for(int i=2;i<=n/2;i++) {
	    		if(n%i==0) {
	    			return false;
	    		}
	    		
	    	}
	    	return true;
	    }

}

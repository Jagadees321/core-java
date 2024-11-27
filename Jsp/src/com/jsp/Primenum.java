package com.jsp;

public class Primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        if(isprime(n)) {
        	System.out.println("prime");
        }
        else {
        	System.out.println("not prime");
        }
	}
    public static boolean isprime(int num) {
    	if(num<2) {
    		return false;
    	}
    	for(int i=2;i<=num/2;i++) {
    		if(num%i==0) {
    			return false;
    		}
    	}
    	return true;
    }
}

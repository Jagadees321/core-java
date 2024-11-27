package com.oops.ss;

public class Cons {
	



    Cons() {

        System.out.println("i am constructor");
	}
    {


    	System.out.println("i am non static block");
    }
    static {
    	System.out.println("i am static block");
    }
	
	

	public static void main(String[] args) {
		Cons a=new Cons();
	
	}

}

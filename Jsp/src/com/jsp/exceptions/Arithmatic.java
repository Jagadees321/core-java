package com.jsp.exceptions;

//import java.rmi.AlreadyBoundException;

public class Arithmatic {

	public static void main(String[] args) 
	{
	    try {
		System.out.println(10/0);

	    }
	    catch(ArrayIndexOutOfBoundsException e) {
	    	System.out.println(10/2);
	    }
	    catch(NumberFormatException a) {
	    	System.out.println("handled");
	    }
	    catch(ArithmeticException e) {
	    	System.out.println(e.getMessage());
	    	System.out.println(10/2);
	    }
	    finally {
	    	System.out.println(10/5);
	    }
	    
	}
}

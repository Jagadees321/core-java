package com.jsp.exceptions;

@SuppressWarnings("serial")
public class InsuficientbalException extends Exception {
	InsuficientbalException(){
		super("low balance");
	}
	InsuficientbalException(String s){
		super(s);
	}
        
}

package com.jsp.exceptions;

public class Bank {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		int n=9000;
		try {
		Account a=new Account(8000);
		System.out.println("account bal :"+a.getbal());
		a.Withdraw(n);
		System.out.println("withdrawn :"+n);
		System.out.println("avalible bal :  "+a.getbal());
		}catch(InsuficientbalException e) {
			System.out.println(e.getMessage());
		}
	}

}

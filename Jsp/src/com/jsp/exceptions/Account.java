package com.jsp.exceptions;

public class Account {
	private int bal;
	public Account(int b) {
		bal=b;
	}
	public int getbal() {
		return bal;
	}
	public void Withdraw(int amount) throws InsuficientbalException {
		if(amount>bal) {
			throw new InsuficientbalException();
		}
		bal-=amount;
		//System.out.println(bal);
	}
		

}

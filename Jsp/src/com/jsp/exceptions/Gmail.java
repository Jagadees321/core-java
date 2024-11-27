package com.jsp.exceptions;

public class Gmail {

	public static void main(String[] args) throws WrongnameException, WrongpwdException {
		// TODO Auto-generated method stub
		String name="jagadeesh";
		long pwd= 123456;
		if(name.equals("jagadeesh")) 
		{
			if(pwd==123456) 
			{
				System.out.println("login");
			}
			else 
			{
				try {
				   throw new WrongpwdException();
				}catch(WrongpwdException e) {
					System.out.println("wrong password entered");
				}
			}
		}
		else {
			try {
				throw new WrongnameException();
			}catch(WrongnameException a) {
				System.out.println(a.getMessage());
			}
			
		}

	}

}

package com.jsp;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		int n=7;
	    int h=100;
	    boolean flag=false;
	    for (int i=n;i<=h;i++)
	    {
	    	if(isPrime(i) && flag==true) {
				System.out.println(i);
				
				flag=false;
				
			} 
	    	else {
	    		flag=true;
	    	}
		     
				
			
				
			
			 
	    }

		
	}
    

	static boolean isPrime(int n)
	{
		if (n<2)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			
		}
		return true;

	}

}

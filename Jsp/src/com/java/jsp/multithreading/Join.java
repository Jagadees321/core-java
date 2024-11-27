package com.java.jsp.multithreading;

public class Join {
    private static int c=0;
    public static synchronized void inc() {
    	c++;
    }
	public static void main(String[] args) throws InterruptedException
	{
		
		// TODO Auto-generated method stub
		Thread t=new Thread(new Runnable() 
		{

			@Override
			public void run() 
			{
				for(int i=1;i<=50;i++) 
				{
					
					inc();
				}
				
			}
		
		});
		Thread t2=new Thread(new Runnable() 
		{

			@Override
			public void run() 
			{
				for(int i=1;i<=500;i++) 
				{
					
					inc();
				}
				
			}
		
		});
		t.start();
		t2.start();
		t.join();
		t2.join();
		System.out.println(c);

	}

}

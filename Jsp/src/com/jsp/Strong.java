package com.jsp;

import java.util.Scanner;

public class Strong {
	public static void main(String[] args) {
		//int n=145;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=n;
		int sum=0;
		while(n>0)
		{
			int d=n%10;                                                                                                                                                                                                                                    
			int fact=1;
			for(int i=1; i <=d;i++)
			{
				fact*=i;
			}
			sum=sum+fact;
			
			n=n/10;
			
			
		}
		if(num==sum) {
			System.out.println("strong");
		}
		else {
			System.out.println("not strong");
		}
		sc.close();
	}

}

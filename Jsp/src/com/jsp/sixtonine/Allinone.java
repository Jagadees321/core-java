package com.jsp.sixtonine;

import java.util.Scanner;

public class Allinone {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        boolean r=true;
        do {
        	System.out.println("1.prime\n2.factors\n3.armstrong\n4.exit");
        	int n=s.nextInt();
        	switch(n%3) {
        	case 1:{
        		System.out.println("enter a number");
        		int p=s.nextInt();
        		if(Altprime.isPrime(p)) {
        			System.out.println("prime");
        			System.out.println("------------------------------------------");
        		}
        		else {
        			System.out.println("not prime");
        			System.out.println("------------------------------------------");
        		}
        		break;
        	}
        	case 2:{
        		System.out.println("enter a number");
        		int f=s.nextInt();
        		int fact=1;
        		for(int i=1;i<=f;i++) {
        			fact*=i;
        		}
        		System.out.println(" factorial of "+f+" is"+fact);
        		System.out.println("------------------------------------------");
        		
        	}
        	break;
        	case 3:{
        		System.out.println("enter a number");
        		int n1=s.nextInt();
        		
        			if(Arm.isarm(n1,Arm.order(n1))) {
        				System.out.println(n1+"    is a armstrong number");
        			}
        			else {
        				System.out.println(n1+"   not armstrong");
        			}

        	}
        	break;
        	case 4:{
        		System.out.println("------------------------------------------");
        		System.out.println("enter number");
        		int n1=s.nextInt();
        		int temp=n1;
        		int sq=n1*n1;
        		int d=1;
        		while(n1>0) {
        			d*=10;
        			n1=n1/10;
        		}
        		sq=sq%d;
        		
        		if(temp==sq) {
        			System.out.println(n1+" is automarphic");
        		}
        		else {
        			System.out.println(n1+"  is not automarphic");
        		}
        		System.out.println("------------------------------------------");
        		
        	}
        	break;
        	case 5:
        	{
        		System.out.println("------------------------------------------");
        		System.out.println("enter number");
        		int a=s.nextInt();
        		if(Happynumber.happy(a)) {
        			System.out.println(a+" is happy");
        		}
        		else {
        			System.out.println(a+"  isnot happy");
        		}
        		System.out.println("------------------------------------------");
        	}
        	break;
        	case 6:
        	{
        		System.out.println("------------------------------------------");
        		System.out.println("enter numbers");
        		int l=s.nextInt();
        		int h=s.nextInt();
        		
        		int firsth=0;
        		int sech=0;
        		for(int i=l;i<=h;i++) {
        			if(Largestprime.isPrime(i)) {
        				if(i>firsth) {
        					sech=firsth;
        					firsth=i;
        					
        				}
        			}
        			
        		}
        		//System.out.println(firsth);
        		System.out.println(sech+" is second largest prime");
        		System.out.println("------------------------------------------");
        		
        	}
        	break;
        	case 7:
        	{
        		System.out.println("------------------------------------------");
        		System.out.println("enter numbers");
        		int k=s.nextInt();
        		int temp=k;
        		int sum=0;
        		int sq=k*k;
        		while(sq>0) {
        			int r1=sq%10;
        			sum+=r1;
        			sq=sq/10;
        			
        			
        		}
        		if(temp==sum){
        			System.out.println(k+" is neon");
        		}
        		else {
        			System.out.println(k+" is not neon");
        		}
        		System.out.println("------------------------------------------");
        	}
        	case 8:
        	{
        		System.out.println("------------------------------------------");
        		
        		int a=0;
        		int b=1;
        		int d=9;
        		int c;
        		if(d==0 || d==1) {
        			System.out.println("belongs");
        		}
        		for( ; ; ) {
        			c=a+b;
        			if(c==d) {
        				System.out.println(" belongs");
        				break;
        			}
        			if(c>d) {
        				System.out.println("not belongs");
        				break;
        			}
        			a=b;
        			b=c;
        		}
        		System.out.println("------------------------------------------");
        	}
        	break;
        	case 9:{
        		System.out.println("------------------------------------------");
        		System.out.println("enter numbers");
        		int f=s.nextInt();
        		int num=n;
        		int sum=0;
        		while(f>0)
        		{
        			int d=f%10;                                                                                                                                                                                                                                    
        			int fact=1;
        			for(int i=1; i <=d;i++)
        			{
        				fact*=i;
        			}
        			sum=sum+fact;
        			
        			f=f/10;
        			
        			
        		}
        		if(num==sum) {
        			System.out.println("strong");
        		}
        		else {
        			System.out.println("not strong");
        		}
        		System.out.println("------------------------------------------");
        	
        	
        	}
        	case 10:
        	{
        		System.out.println("exit");
        		r=false;
        		
        	}
        	}
        }while(r);
        s.close();
	}

}

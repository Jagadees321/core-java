package jsp.practice;

import java.util.Scanner;

public class Komala {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in)) {
			int n1=s1.nextInt();
			//String s=s1.nextLine();
			int n2=s1.nextInt();
			int n3=s1.nextInt();
			int key=findkey(n1,n2,n3);
			System.out.println(key);
		}
		
	}
	
	public static int findkey(int a,int b,int c) {
		int key=0;
		int l=greatdigit(a)+greatdigit(b)+greatdigit(c);
		int s=smalldigit(a)+smalldigit(b)+smalldigit(c);
		key=l-s;
		return key;
	}
	public static int smalldigit(int n)
	{
		int small=0;
		int r=0;
		while(n>0) 
		{
			r=n%10;
			if(r<small) 
			{
				small=r;
				
			}
			n=n/10;
			
		}
		
		return small;
	}
	
	
	public static int greatdigit(int n)
	{
		int large=0;
		int r=0;
		while(n>0) 
		{
			r=n%10;
			if(r>large) 
			{
				large=r;
				
			}
			n=n/10;
			
		}
		//System.out.println(large);
		return large;
	}
	

}

package com.jsp.arrays;

public class Small2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[]a= {2,3,5,8,9,1,8};
		System.out.println(small(a));

	}
	public static int small(int a[])
	{
		int s1=a[0];
		int s2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]==s1) continue;
			if(a[i]<s1) 
			{
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2 || s1==s2) 
			{
				s2=a[i];
			}
		}
		return s2;
	}

}

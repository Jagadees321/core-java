package com.jsp;

public class ArmstrongString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="153";
		if(s3(s1)) {
			System.out.println("is arm");
		}
		else {
			System.out.println("not");
		}

	}
	public static boolean s3(String s) {
		char[]a=s.toCharArray();
		//String sum = "";
		int s1 = 0;
		//int s2=0;
		for(int i=0;i<s.length();i++) {
			if(a[i]>='0' && a[i]<='9') {
		//		sum+=""+a[i];	
			}
			
		}
		
		while(s1>0) {
		//	int r=s1%10;
		//	s2+=r;
			s1=s1/10;
			
		}
		System.out.println(s1);
		return isarm(s1,order(s1));
	}
	static int order(int x) {
		int len=0;
		while(x!=0) {
			len++;
			x=x/10;
		}
		return len;
	}
	static boolean isarm(int num,int len) {
		int sum=0;
		int temp=num;
		double d;
		while(temp>0)
		{
			d=temp%10;
			sum=(int) (sum+Math.pow(d, len));
			temp=temp/10;
		}
		
		return num==sum;
		
	}
	

}

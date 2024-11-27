package com.jsp;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2;;i++) {
			if(ismagic(i)) {
				System.out.println(i);
				break;
			}
		}
			

	}
	public static boolean ismagic(int n) {
		
		int temp=n;
		int sum=0;
		while(n>0) {
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		int sum1=sum;
		int rev=0;
		while(sum>0) {
			int d=sum%10;
			rev=(rev*10)+d;
			sum=sum/10;
			
		}
		int p=sum1*rev;
		if(p==temp) {
			return true;
			
		}
		else {
			return false;
		}
			
	}

}

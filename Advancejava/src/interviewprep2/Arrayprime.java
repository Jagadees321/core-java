package interviewprep2;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayprime {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][]a=new int[3][3];
		System.out.println("enter elements");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("before modify");
		for(int []b:a) {
			System.out.println(Arrays.toString(b));
		}
		modifyarray(a);
		System.out.println("after modify");
		for(int []b:a) {
			System.out.println(Arrays.toString(b));
		}
		if(isdiagonalequal(a)){
			System.out.println("equal");
		}
		else {
			System.out.println("not");
		}
		
	}
	public static void modifyarray(int[][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				
				if(isPrime(a[i][j])) {
					a[i][j]+=10;
				}
				else {
					a[i][j]+=15;
				}
				
				
			}
		}
		
	}
	public static boolean isPrime(int a) {
		if(a<2)return false;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static boolean isdiagonalequal(int [][]a) {
		int d1=0;
		int d2=0;
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) {
				
				if(i==j) {
					d1+=a[i][j];
				}
				else if(i+j==a.length) {
					d2+=a[i][j];
				}
				
				
			}
		}
		return d1==d2;
		
	}

}

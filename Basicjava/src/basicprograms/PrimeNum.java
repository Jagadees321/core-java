package basicprograms;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int i=2;
		if(n<2)
		{
			System.out.println(" not a prime");
		}
		while(i<n) {
		if(n%i==0) {
			System.out.println("not prime");
		}
		if(n/2!=0) {
			System.out.println("prime number "+i);
		}
		i++;
		}
	}

}

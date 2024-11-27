package patterns;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println("enter a Number" +n);
		if(n%400==0) 
			System.out.println("Leap Year");
		else if(n%4==0&&n%100==0)
			System.out.println("leap year");
		else System.out.println("not a leap year");
		}

	}


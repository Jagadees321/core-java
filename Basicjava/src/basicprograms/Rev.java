package basicprograms;

import java.util.Scanner;


public class Rev {
	int n=10;
		boolean m() {
			if(n<2)System.out.println("");
			
			return false;
		}
		boolean isPrmie(int n) {
			if(n%2==0) {System.out.println("not a prime");
			return false;}
			else {
				System.out.println("prime");
			return true;
			}
		}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(n);
		Rev r=new Rev();
		r.isPrmie(100);
		r.m();
	}

}

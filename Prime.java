import java.util.*;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(isPrime(n));
	}
	static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		
		return isPrimehelper(n,n-1);
		

	}
	static boolean isPrimehelper(int n,int i)
	{
		if(i==1)
		{
			return true;
		}
		if(n%i==0)
		{
			return false;
			
		}
		return isPrimehelper(n,i-1);
	}

}
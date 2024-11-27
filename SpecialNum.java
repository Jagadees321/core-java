import java.util.Scanner;
class SpecialNum 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter  a value");
		int num=s.nextInt();
		int temp=num;
		int sum=0;
		int p=1;
		while(n>0)
		{
			int rem = n%10;
			p=p*rem; sum=sum+num;
			num=num/10;
		}
		int total=p+sum;
		if(total==temp)
		{
			System.out.println("SpecialNum ");
		}
		else
			{
			System.out.println(" Not SpecialNum ");
		}



	}
}

class Rev 
{
	public static void main(String[] args) 
	{
		System.out.println(rev(567));
	}
	static int rev(int n)
	{
		if (n<=9)
		{
		     return n;
		}
		else
		{
			System.out.print(n%10);


		
		     return +rev(n/10);   
		}
	}
}

class  Prime
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	int l=5;
	int h=100;
	for(int i=l;i<=h;i++)
	{
		if(isPrime(i))System.out.println(i);
	}
    

	static boolean isPrime(int n)
	{
		if (n<2)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
			return true;
		}
}
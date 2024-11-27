class A
{
	int a;
	int b;
	A(int c)
	{
		a=c;
		b=c;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}


}
class Ab 
{
	public static void main(String[] args) 
	{
		A a1=new A(5);
		a1.display();

	}
}

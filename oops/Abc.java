class Ab 
{
    void m1()
	{ 
		System.out.println("ab");
	}
}
class Bc extends Ab
{
	@Override
	void m1()
	{ 
		System.out.println("bc");
	}

}
class Abc
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//Ab.m1();
		Bc b1=new Bc();
		b1.m1();

	}
}

class Ab 
{
    void m1()
	{ 
		System.out.println("ab");
	}
}
class Bc extends Ab
{
	final void m1()
	{ 
		System.out.println("bc");
	}
}
class Cd extends Bc
{
	void m2()
	{ 
		System.out.println("cd");
	}

}

class Abcd 
{
	public static void main(String[] args) 
	{
		Bc b=new Bc();
		b.m1();
		//Ab a=new Ab();
		//a.m1();
	}
}

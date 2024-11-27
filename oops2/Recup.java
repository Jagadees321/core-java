class Aa
{
	int i=10;
	void m1()
	{
		System.out.println("Aa");

	}
}
class Bb extends Aa
{
	int i=20;
	void m1()
	{
		System.out.println("Bb");

	}

}
class Cc extends Bb
{
	int i=30;
	void m1()
	{
		System.out.println("Cc");

	}
}


class Recup 
{
	public static void main(String[] args) 
	{
		Aa a=new Bb();
		a.m1();
		System.out.println(a.i);
		//System.out.println(i);//error
		System.out.println("....................................");
		Bb b=new Bb();
		b.m1();
		System.out.println(b.i);
		System.out.println("....................................");
		a=new Bb();
		a.m1();// method takes  references of instances type
		System.out.println(a.i);//variable takes reference of datatype


	}
}

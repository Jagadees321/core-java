class A
{
	static void m1()
	{
		System.out.println("m1 in A");
	}
}
class B extends A
{
	static void m1()
	{
		System.out.println("m2 in B");
	}
}
class C extends B
{
	static void m1()
	{
		System.out.println("m3 in C");
	}
}
class Earlybinding 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		A.m1();
		B.m1();
		C.m1();
		A b1=new A();
		b1.m1();
		B b=new B();
		b.m1();
		A a=new B();
		a.m1();// early binding

	}
}


class A
{
	int i=10;
	void m1(){
		System.out.println("A");
	}
}
class B extends A
{
	int j=12;
	void m2(){
	    System.out.println("B");
	}
}
class C extends B
{
	int z=15;
	void m3()
	{
	     System.out.println("C");
	}

}



class VarrefMetref2 
{
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		//a.m2();
		System.out.println(a.i);
		System.out.println(".............................................................");
		B b=new C();
		b.m1();
		b.m2();
		System.out.println(b.i);
		System.out.println(b.j);
		System.out.println(".............................................................");
		C c=new C();
		c.m1();
		c.m2();
		c.m3();
		System.out.println(c.i);
		System.out.println(c.j);
		System.out.println(c.z);



	}
}

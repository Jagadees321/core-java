class A
{
	void m1(){
		System.out.println("Hello JAYASHIMA");

	}
}
final class B extends A
{
	void m1(){
		System.out.println("b");

	}

}
//class C extends B
//{
	//void m1(){
		//System.out.println("b");

	//}

//}


class Test 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		B b=new B();
		b.m1();
	}
}

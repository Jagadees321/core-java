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
	int z=12;
	void m3()
	{
	     System.out.println("C");
	}

}



class VarrefMetref 
{
	public static void main(String[] args) 
	{
		A a=new A();
		
		a.m1();
		//a.m2();// using A reference can't reffered B and C class perparties
		//a.m3();// using A reference can't reffered B and C class perparties
		System.out.println(a.i);
		//System.out.println(a.j);// using A reference can't reffered B and C class perparties
		System.out.println(".............................................................");
		a=new B();
		/*
		a.m1();
		a.m2();
		a.m3();
		System.out.println(a.i);
		
		System.out.println(a.j);
        System.out.println(a.z);
		*/
	
	
	}
}

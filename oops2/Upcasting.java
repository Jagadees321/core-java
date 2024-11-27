class  Upcasting
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		Bmw b=new Bmw();
		Audi c=new Audi();
		A a=new A();
		Driver1 d=new Driver1();
		d.drive(b);
		
		
	}
}
class A
{
	void m1(){
		System.out.println(".........");

	}
}
class Audi extends A
{
	void m2(){
		System.out.println("audi");

	}

}
class Bmw extends A
{
	void m3(){
		System.out.println("bmw");

	}
}
class Driver1
{
	void drive(A a){
		
		      System.out.println("drive Bmw car");
		
		     
			 System.out.println("drive audi car");
		

	}

}

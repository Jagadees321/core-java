package jsp.practice.ganeshpractice;

public class Method 
{
    int n=9;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//String a=A();
		A();
		
		
		

	}
	public static void  A() 
	{
		System.out.println(5);
		System.out.println("asd");
		Method m=new Method();
		int k=m.m1();
		System.out.println(k);
	}
	
	int m1() {
		return n;
	}

}

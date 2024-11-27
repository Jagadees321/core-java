package jsp.practice;

public class S {
	int b=7;
	int d=3;
	int e=4;
    static int a=8;
	public static void main(String[] args) 
	{
		int a=9;
		System.out.println(a);
		System.out.println(S.a);
		S c=new S();
		c.b=676;
		System.out.println(c.b);
		System.out.println(c.d);
		System.out.println(c.e);
		
		if (System.out.printf("Hello, World!") != null) {
            // The body can be empty since the condition always evaluates to true
        }  
	}
	
	
}

package patterns;

import com.filehandling.Bufferedinput;

public class B {
	int a;
    B(int b){
    	
    	System.out.println("i am constrctor");
    }
    
	public static void main(String[] args) {
		B b=new B(9);
		b.a=8787;
		System.out.println(b);
		System.out.println(b.a);
		Bufferedinput b1=new Bufferedinput();
		
	}

}

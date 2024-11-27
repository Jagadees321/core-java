package patterns;

public class A {
	   
    void m1() {
    	System.out.println("i am class a m1 method");
    }
}
class B extends A{
		
		void m2() {
			System.out.println("i am class B m2 method");
		}
		
		
		public static void main(String[] args) {
			B b=new B();
			b.m1();
		}
}
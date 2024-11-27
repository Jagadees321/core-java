package innerclasses;

import innerclasses.A.B;

class A{
	int i=5;;
	static int j=6;
	class B {
		public static void main(String[] args) {
			System.out.println("main");
		}
		public void m1() {
			System.out.println(i+" "+j);
		}
	}
}


public class Ot2 {
	public static void main(String[] args) {
		A a = new A();
		B b = a.new B();
		b.m1();
		
		B b2 = new A().new B();
		
		
	}
}

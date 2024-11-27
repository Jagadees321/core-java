package com.jsp.Innerclass;

public class Methodlocal {
    void m1() {
    	class A{
    		//we can declare method local inner class inside non static method
    	}
    }
    static int a=8;
	public static void main(String[] args) {
//		static class A{
//			
//		} 
		
//		1.we cant make method local inner class as static
		
//		class Aa{
//			static void m1{
//				
//			}
//		}
//		2.so we cant declere static method inside method local inner class
		class B{
			//we can declare method local inner class inside  static method
			void m2() {
				System.out.println(a);
			}
			
		}
		B b=new B();
		b.m2();
		
		

	}

}

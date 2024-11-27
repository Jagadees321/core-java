package oops;

public class B extends A{
    @Override
    public void m1(C a) {
    	
    	System.out.println("m1 in b");
    	a.m2();
    }
}

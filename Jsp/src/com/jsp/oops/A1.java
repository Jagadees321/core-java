package com.jsp.oops;

public interface A1 {
	void m1();//abstart method
	default void m2() {
		System.out.println("default method");
	}

}

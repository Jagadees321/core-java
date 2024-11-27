package jsp.practice;

import java.util.Arrays;

public class A{
	int a;
	int b;
	A(int a,int b,int c){
		this.a=a;
		this.b=b+c;
	}
	public static void main(String[] args) {
		A a=new A(2,3,4);
		System.out.println(a.b);
	}
	
}
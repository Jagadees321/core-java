package com.jsp.oops;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class N
{
	int i;
	void m1() {
		System.out.println(i);
		System.out.println("i am m1");
	}
	

}
class K extends N{
	int j;
	public void m2() {
		i=10;
		System.out.println(i);
		System.out.println(j);
		System.out.println("i am m2");
	}
	
}

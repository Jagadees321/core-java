package basicprograms;

public class A {
   // changing or providing the implementation of super class method in child class
	//Is-A relationship complusory
	 A m1() {
		System.out.println("hello");
		return new A();
	}

}
class B extends A{
	
	@Override
     public  B m1() {
		System.out.println("hello");
		return new B();
	}
	//privates
	//defaoult
	//proteceted
	// public
     
     // static or final  methods cant be overridde
     // in overridding return type should be same or coveriant
	
}

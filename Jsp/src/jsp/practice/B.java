package jsp.practice;

public class B {
	int i;
	B(int j){
		i=j;
		
		
	}
	void k1() {
		System.out.println(i);
		
	}

}
class C extends B{
	int j;
	C(int z){
		super(8);
		j=z;
	}
	void k2() {
		
		System.out.println(j+i);
	}
}

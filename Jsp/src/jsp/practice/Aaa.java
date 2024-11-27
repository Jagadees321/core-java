package jsp.practice;

public class Aaa {
	int a;
	int b;
	public Aaa(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	void m1() {
		System.out.println(a+""+b);
	}
	public static void main(String[] args) {
		Aaa b=new Aaa(6,7);
		Aaa c=b;
		c.m1();
		b.m1();
	}

}

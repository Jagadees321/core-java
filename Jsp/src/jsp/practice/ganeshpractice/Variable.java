package jsp.practice.ganeshpractice;

public class Variable {
	//static int n=10;
	int a=8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		System.out.println(n);
		//System.out.println(Variable.n);
		Variable b=new Variable();
		System.out.println(b.a);
		//System.out.println(b.m2());

	}
	int m2() {
		return a;
	}
	

}

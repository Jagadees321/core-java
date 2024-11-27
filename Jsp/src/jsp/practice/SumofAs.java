package jsp.practice;

public class SumofAs {
	
	
	int A=5;
	int m1() {
		A=3;
		return A;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofAs a=new SumofAs();
		System.out.println(a.A+a.m1());

	}

	

}

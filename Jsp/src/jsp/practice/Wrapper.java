package jsp.practice;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g=8;
		Integer a=(int) g;
		System.out.println(a);
		int b=(Integer)a;
		@SuppressWarnings("removal")
		Integer n=new Integer(7);
		int c=n;
		System.out.println(c);
		System.out.println(b);
		

	}

}

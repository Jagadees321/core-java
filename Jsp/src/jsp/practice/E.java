package jsp.practice;

public class E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=0;
       int  b=m1(a++)+m1(++a);
       System.out.println(b);
	}
	static int m1(int a) {
		return a++;
	}

}

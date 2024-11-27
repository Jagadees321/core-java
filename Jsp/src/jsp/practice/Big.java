package jsp.practice;

public class Big {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=65;
		int b=54;
		int max=a>b?a:b;
		System.out.println("max = "+max);
		int max1;
		
		
		
		if(a>b) {
			max1=a;
		}
		else {
			max1=b;
		}
		
		System.out.println("max1 = "+max1);
		
		if(a>b) {
			System.out.println("a is big = "+a);
		}
		else {
			System.out.println("b is big = "+b);
		}

	}

}

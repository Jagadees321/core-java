package Lambdaexp;

public class TestI1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		I1 i=new I1(){
			public int add(int a, int b) {
				System.out.println("hello "+(a+b));
				return a+b;
			};
		};
		int k=i.add(6,7);
		System.out.println(k);
		I1 i2=(a,b)->{
			System.out.println("hello i2");
			return a+b;
		};
		System.out.println(i2.add(9, 14));;
		
		I2 i21=e->e*e;
		System.out.println(i21.sq(7));

	}

	
}

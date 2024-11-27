package jsp.practice;

public class Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main start");
		m1();
		System.out.println("main end");
		

	}
	
	public static void m1() {
		System.out.println("m1 start");
		for(int i=1;i<=11;i++) {
			System.out.print(i+" ");
			if(i==10) break;
		}
		System.out.println("m1 end");
	}

}

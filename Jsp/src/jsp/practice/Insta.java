package jsp.practice;

public class Insta {
   int i=m1();
   
   Insta(){
	   System.out.println("con");
   }
   
   {
	   System.out.println("in bl");
   }
   
	
	
	
	
	
	int m1() {
		System.out.println("m1 method");
		return 20;
	}
	public static void main(String[] args) {

		Insta i=new Insta();

	}

}

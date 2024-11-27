package innerclasses;

import innerclasses.OuterC.innerc;

class OuterC{
	
	static class innerc{
//		public static void main(String[] args) {
//			System.out.println("IC MAIN");
//		}
		
		public void m2() {
			System.out.println("abcd");
		}
	}
}



public class OuterClass1 {

	public static void main(String[] args) {
		 innerc ic = new OuterC.innerc();
		 ic.m2();
		 
	}

}

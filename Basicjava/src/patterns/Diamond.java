package patterns;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=5;
//		for(int i=1;i<=n;i++) 
//		{
//			for(int j=1;j<=n+1-i;j++) 
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			for(int j=2;j<=i;j++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=2;i<=n;i++) 
//		{
//			for(int j=1;j<=i;j++) 
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=n+1-i;j++) {
//				System.out.print("*");
//			}
//			for(int j=25;j<=n+1-i;j++) 
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		m1(6);

	}
	
	
	static void m1(int n) {
		int k=1;
		int d=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2!=0)System.out.print(k++);
				else System.out.print(k--);
			}
			System.out.println();
			k+=d;
			if(i%2!=0)d+=2;
		}
	}

}
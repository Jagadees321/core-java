package jsp.practice;

public class Bp {

	public static void main(String[] args) {
		int n=5;
		int f=1;
		int s=2*n-2;
		for(int i=1;i<=2*n;i++)
		{
			for(int j=1;j<=f;j++) 
			{
				System.out.print("*");
			}
			for(int k=1;k<=s;k++) {
				System.out.print(" ");
			}
			for(int l=1;l<=f;l++) 
			{
				System.out.print("*");
			}
			if(i<n) {
				f++;
				s-=2;
			}
			else {
				f--;
				s+=2;
			}
			System.out.println();
		}

	}

}

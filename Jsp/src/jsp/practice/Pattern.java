package jsp.practice;

public class Pattern {

	public static void main(String[] args) {
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=5;j>=i-1;j--) {
			    System.out.print(" ");
			}
			for(int k=7;k>=0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

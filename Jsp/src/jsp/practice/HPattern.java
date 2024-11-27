package jsp.practice;

public class HPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print(" ");
				}
			}
			for(int k=2*n-2;k>=2*i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

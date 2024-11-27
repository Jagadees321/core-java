package patterns;

public class J {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++) {
			System.out.print(" *");
		}
		System.out.println();
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=5;j++) {
				if(j==3) {
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(j==3 || i==j) {
					System.out.print(" *");
				}
				else {
					System.out.print(" ` ");
				}
			}
			System.out.println();
		}
		

	}

}

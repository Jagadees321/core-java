package jsp.practice;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=9;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=row-i;k++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
	}

}

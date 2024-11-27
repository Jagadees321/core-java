package patterns;

import java.util.Iterator;

public class A1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=5;
		
		for (int i=1 ; i <= n; i++) {
			for(int j=1;j<=n;j++) {
                if(i+j<=n+1 || j>=i) {
                	System.out.print("* ");
                }
                else {
                	System.out.print("  ");
                }

				
			}
			System.out.println();
			
		}
		

	}

}

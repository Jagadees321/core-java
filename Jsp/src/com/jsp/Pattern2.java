package com.jsp;

public class Pattern2 {
		public static void main(String[] args) {
			int n=5;
			for(int i=n;i>0;i--) {
//				for(int j=1;j<=n;j++) {
//					if(i==2 ) break;;
//					System.out.print(i+""+j+" ");
//					
//				
//				}
				int j=1;
				while(j<=5) {
					if(i==3)break;
					System.out.print(i+""+j+" ");
					
					j++;
				}
				System.out.println();
			}
		

	}
	 

}

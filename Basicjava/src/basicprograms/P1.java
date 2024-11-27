package basicprograms;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		
		for(int i=1;i<=5;i++) {
			boolean k=true;
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
				    if(k) {
				    	System.out.print(" 1 ");
				    	k=false;
				    }
				    else {
				    	System.out.print(" 0 ");
				    	k=true;
				    }
					
				}
				else {
					
					if(k) {
				    	System.out.print(" 0 ");
				    	k=false;
				    }
				    else {
				    	System.out.print(" 1 ");
				    	k=true;
				    }
				}
			}
			System.out.println();
		}
	}

}

package jsp.practice;

public class Hcf {

	public static void main(String[] args) {
		int n=12;
		int m=24;
	    int a=0;
		int f=0;
		int f2=0;
		for(int i=1;i<n || i<m;i++) {
			if(n%i==0 && m%i==0) {
				a=i;
				if(f<i) {
					f2=f;
					f=i;
					
				}
				//System.out.println(f);	
				System.out.println(f2);
				//System.out.println(i);
			}
		}
		System.out.println(" hcf num   "+a);
		System.out.println(f);	
		System.out.println(f2);
	}

}

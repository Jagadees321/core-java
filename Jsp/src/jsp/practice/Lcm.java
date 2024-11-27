package jsp.practice;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int m=12;
		int a=9;
		int lcm=0;
		int min=(n>m)?n:m;
		int max=(a>min)?a:min;
		//System.out.println(max);
		for(int i=max;i<=n*m*a;i++) {
			if(i%n==0 && i%m==0 && i%a==0) {
				lcm=i;
				break;
			}
		}
		System.out.println(lcm);

	}

}

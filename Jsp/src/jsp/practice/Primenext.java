package jsp.practice;

public class Primenext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		prime(a);

	}
	public static void prime(int a) {
		int n=a;
		int count=0;
		for(int i=2;i<=a/2;i++) {
			a++;
			if(a%i==0) {
				continue;
			
				
			}
			else {
				count=a-n;
				System.out.println(count);
				return;
			}
		}
		//System.out.println(count);
		
		
	}

}

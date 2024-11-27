package jsp.practice;

public class Palindrome {

	public static void main(String[] args) {
		int n=56;
		for(int i=n+1;    ;i++) {
			if(ispalindrome(i)) 
			{
				System.out.println(i);
				break;
			}
		}



	}
	public static boolean ispalindrome(int n) {
		int temp=n;
		int rev=0;
		while(n>0) {
			int r=n%10;
			rev=(rev*10)+r;
			n=n/10;
		}
		return temp==rev;
	}

}

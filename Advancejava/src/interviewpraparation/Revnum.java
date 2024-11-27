package interviewpraparation;

public class Revnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int rev;
		StringBuilder s=new StringBuilder(String.valueOf(n));
		s.reverse();
		rev=Integer.valueOf(String.valueOf(s));
		System.out.println(rev);
				
		
		

	}

}

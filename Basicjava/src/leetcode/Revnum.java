package leetcode;

public class Revnum {

	public static void main(String[] args) {
		int n=-1534236769;
		System.out.println(numrev(n));

	}
	
	public static long numrev(int x) {

		 int t=x;
	       // if(x<0) x=-x;
	        int rev=0;
	        while(x!=0){
	           int r=x%10;
	           rev=(rev*10)+r;
	           x=x/10;
	        }
	        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE) return 0;
	        return (int)rev;
	}

}

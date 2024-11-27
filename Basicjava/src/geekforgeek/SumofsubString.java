package geekforgeek;

public class SumofsubString {

	public static void main(String[] args) {
		System.out.println(sumofsubstring("421"));

	}
//	public static int sumofsubstring(String s) {
//		int sum=0;
//		for(int i=0;i<s.length();i++) {
//			System.out.println(s.substring(i, i+1));
//			sum+=Long.parseLong(s.substring(i, i+1));
//			for(int j=i+1;j<s.length();j++) {
//				System.out.println(s.substring(i, j+1));
//				sum+=Integer.parseInt(s.substring(i, j+1));
//			}
//		}
//		return sum;
//	}
	public static long sumofsubstring(String s) {
	    if (s == null || s.length() < 1) {
	        return 0;
	    }
	    long sum = 0;
	    long current = 0;
	    long mod = 1000000007;
	    
	    for (int i = 0; i < s.length(); i++) {
	    	System.out.println("  "+current);
	        current = (current * 10 + (i + 1) * (s.charAt(i) - '0')) % mod;
	        System.out.println(current);
	        sum = (sum + current) % mod;
	        System.out.println("              "+sum);
	    }
	    
	    return sum;
	}


}

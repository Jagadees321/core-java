package strings;

public class Longpolindromicsubstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
           
           String s1="acca";
           //System.out.println(s1.substring(0,2));
           System.out.println(highestsunstr(s1));
           
	}
	public static String highestsunstr(String s) {
		String longestsubstr="";
		
		for(int i=0;i<s.length();i++) {
			
			for(int j=i+1;j<s.length();j++) {
				System.out.println(s.substring(i, j));
				if(ispalindrome(s.substring(i, j)) && s.substring(i, j).length()>longestsubstr.length()) {
					longestsubstr=s.substring(i, j);
					
				}
			}
		}
		return longestsubstr+"gggg";
	}
	public static  boolean ispalindrome(String s) {
		// TODO Auto-generated method stub
		
		int i=0;
		int j=s.length()-1;
		while(i<=j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;

	}

}

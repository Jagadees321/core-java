package geekforgeek;

public class ConvertStringtonum {
	static int atoi(String s) {
		// Your code here
		int res=0;
		int num=1;
		for(int i=0;i<s.length();i++) {
			char  c=s.charAt(i);
			if(c>='0' && c<='9' || c=='-') {
				if(c=='-') {
					num= - num;
				}else {
					int n=c-48;
					
					res=(res*10)+n;
					
				}
				
			}else {
				return -1;
			}
		}
	 return res*num;	   
	}
	
	public static void main(String[] args) {
		String s="-123";
		System.out.println(atoi(s));
	}
}

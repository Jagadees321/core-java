package interviews;

public class CommonSubString {

	public static void main(String[] args) {
		
      String s="hello";
      System.out.println(commonsubstr("bowingdownh","downhtown bowing","gamingdownhtown",3));
      
      
	}
	
	public static String commonsubstr(String s1,String s2,String s3,int n) {
		for(int i=0;i<s1.length()-(n-1);i++) {
			String c=s1.substring(i, i+n);
			if(checksubstr(c, s2, n)&& checksubstr(c, s3, n)) {
				return c;
			}
		}
		return "";
		
	}
	public static boolean checksubstr(String s,String s1,int n) {
		int l=s1.length();
		String s2=s1.replaceAll(s, "");
		return  l-n==s2.length() ;
		
	}

}

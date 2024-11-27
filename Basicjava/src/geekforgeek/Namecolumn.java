package geekforgeek;

public class Namecolumn {

	public static void main(String[] args) {
//		int n=29;
//		int j=0;
		char[] a=new char[26];
	
//		for(char i=65;i<=90;i++) {
//			
//			a[j++]=i;
//		}
//		char f1=a[(n/26)-1];
//		char f2=a[(n%26)-1];
//		System.out.println(f1+" "+f2);


		//User function Template for Java
		System.out.println(colName(28));

		
		   
		

	}
	 static String colName (long n)
	    {
	        // your code here
	           String str = "";
	        
	        while(n > 0){
	            long r = n % 26;
	            if(r == 0){
	                n = n - 26;
	                r = 26;
	            }
	            System.out.println(str);
	            str = (char)(r + 64) + str;
	            n = n / 26;
	        }
	        
	        return str;
	    }

}

package jsp.practice;

public class Allpallindrome {

	public static void main(String[] args) {
       String s="malayalam";
       String bigString="";
       for(int i=0;i<s.length()-1;i++) {
    	   for(int j=i+1;j<s.length();j++) {
    		   if(ispallindrome(s,i,j)) {
    			   String temp=s.substring(i, j+1);
    			          if(temp.length()>bigString.length())
    			                bigString=temp;
    		   }
    			   
    	   }
       }
       System.out.println(bigString);
	}
	public static boolean ispallindrome(String s,int start,int end) {
		int i=start;
		int j=end;
		char[] a=s.toCharArray();
		while(i<j) {
			if(a[i]!=a[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}

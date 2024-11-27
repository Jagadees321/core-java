package leetcode;

public class Commendivisionstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          System.out.println(gcdOfStrings("ABCABC","ABC"));
	}
	public static String gcdOfStrings(String str1, String str2) {
	       
        int i=0;
        int j=0;
        while(j<=str2.length()){
            
            String s3=str1.replaceAll(str2.substring(i,j),"");
            
            if(s3.length()==0) return str2.substring(i,j);
            j++;
        }

        return "";
    }

}

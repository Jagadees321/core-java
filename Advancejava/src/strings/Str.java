package strings;

import java.util.Arrays;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"1,3,5","3,5"};
		str(a);

	}
	
	public static void str(String[] s) {
		String starr="";
		String s1=s[0];
		String s2=s[1];
		
		String[] s3=s1.split(",");
		//System.out.println(Arrays.toString(s3));
		String[] s4=s2.split(",");
		//System.out.println(Arrays.toString(s4));
		for(int i=0;i<s3.length;i++) {
			for(int j=0;j<s4.length;j++) {
				if(s3[i].equals(s4[j])) {
					
					starr+=s3[i];
					starr+=",";
				}
			}
		}
		System.out.println(starr);
		
		
	    
		
		
		
	}

}

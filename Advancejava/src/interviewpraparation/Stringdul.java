package interviewpraparation;

import java.util.HashSet;

public class Stringdul {

	public static void main(String[] args) {
		String s1="abcdab";
		String s2="";
		String s3="";
//		for(int i=0;i<s1.length();i++) {
//			char c=s1.charAt(i);
//			if(s2.indexOf(c)==-1) {
//				s2+=""+c;
//			}
//			else {
//				System.out.print(c+" ");
//			}
//		}
//		
        HashSet<Character> h=new HashSet<>();
        for(char c:s1.toCharArray()) {
        	if(h.contains(c)) {
        		System.out.print(c+" ");
        	}
        	else {
        		h.add(c);
        	}
        }
	}

}

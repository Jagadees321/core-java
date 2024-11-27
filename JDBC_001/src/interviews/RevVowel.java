package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RevVowel {

	public static void main(String[] args) {
		System.out.println(revVowel("hello"));

	}
	
	public static String revVowel(String s) {
		List<String> a= Arrays.asList("a","e","i","o","u");
		s=s.toLowerCase();
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++) {
			String c=s.charAt(i)+"";
			if(a.contains(c)) {
				s1+=c;
			}else {
				s2+=c;
			}
		}
		String res="";
		int k=0;
		int j=s1.length();
		for(int i=0;i<s.length();i++) {
			String c=s.charAt(i)+"";
			if(a.contains(c)) {
				res+=s1.charAt(--j)+"";
			}else {
				res+=s2.charAt(k++)+"";
			}
		}
		return res;
		
	}

}

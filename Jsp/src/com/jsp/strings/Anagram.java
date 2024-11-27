package com.jsp.strings;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		
		
		    String s1 = "silent";
		    String s2 = "listen";
		
		    boolean anagram = false;
		    //System.out.println(s1.substring(2));
		    
		    s1=s1.toLowerCase();
		    s2=s2.toLowerCase();
		    if(s1.length()==s2.length()) {
		    	char[]a=s1.toCharArray();
		    	char[]b=s2.toCharArray();
		    	
		    	Arrays.sort(a);
		    	Arrays.sort(b);
		        anagram=Arrays.equals(a, b);
		    	
		    }
		    if(anagram) {
	    		System.out.println("anagram");
	    	}
	    	else {
	    		System.out.println("not anagram");
	    	}
		    
	}
	

}

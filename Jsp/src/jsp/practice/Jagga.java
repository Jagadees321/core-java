package jsp.practice;

import java.util.Arrays;

public class Jagga {
    int a;
	public Jagga(int a) {
		super();
		this.a = a;
	}
	public static void main(String[] args) {
		String s="this is the sentence";
		String[] s1=s.split(" ");
		System.out.println(Arrays.toString(s1));
		String max="";
		for(int i=0;i<s1.length;i++) {
			if(s1[i].length()>max.length()) {
				max=s1[i];
			}
		}
		System.out.println("max = "+max);
	}

}

package strings;

import java.util.Arrays;
import java.util.Stack;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Stringmul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="-30*10";
		String s1="";
		System.out.println(s.split("[*]")[1]);
//		char [] a=s.toCharArray();
//		System.out.println(a);
		Stack<Character> ss=new Stack<>();
		int i=0;
		int j=s.length();
		while(i<j) {
			char c=s.charAt(i);
			if(c>='0' && c<='9') {
				s1+=c;
				 
				
			}
			else  {
				if(s1.length()>1) {
					s1+=",";
				}
				
				ss.add(c);
			}
			
			i++;
		}
		
		String[] s2=s1.split(",");
		//System.out.println(Arrays.toString(s2));
		
		int n1=Integer.parseInt(s2[0]);
		int n2=Integer.parseInt(s2[1]);
//		System.out.println(n1+" "+n2+" "+ss.pop()+" "+ss.pop());
		int res=ss.pop();
//		int res=(ss.pop())+(n1+ss.pop()+n2);
		System.out.println(res);
		
		
		
		

	}

}

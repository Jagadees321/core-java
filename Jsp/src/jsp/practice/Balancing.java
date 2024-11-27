package jsp.practice;

import java.util.Stack;

public class Balancing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="{([()])}";
		System.out.println("");
		if(isBalance(s)) {
			System.out.println("true");
		}else {
			System.out.println("h");
		}
		

	}
	public static boolean isBalance(String s) {
		Stack<Character> s1=new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='{' || c=='[' || c=='(') {
				//System.out.println(c);
				s1.push(c);
			}
			else if(c=='}' || c==']' || c==')')
			{
				char c1=s1.pop();

				if(s1.isEmpty() || !pair(c1,c)) {
					return true;
				}
			}
			
		}
		System.out.println(s1.isEmpty());
		return s1.isEmpty();

		
	}
	private static boolean pair(char c1, char c) {
		// TODO Auto-generated method stub
		if(c1=='[' && c==']') return true;
		if(c1=='{' && c=='}') return true;
		if(c1=='(' && c==')') return true;
		return false;
	
	}

}

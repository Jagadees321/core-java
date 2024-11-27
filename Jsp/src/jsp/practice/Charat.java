package jsp.practice;

public class Charat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="jayashima";
		String s2="";
	
		//System.out.println(s1.charAt(1));
		for(int i=0;i<s1.length();i++) {
			char s=s1.charAt(i);
			s2+=s;
			
		}
		System.out.println(s2);

	}

}

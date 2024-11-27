package interviewpraparation;

public class Countspl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ja*gga@# 47684#";
		int count=0;
		String s2 = "";
		for(int i=0;i<s.length();i++) {
			if(!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i)) && !Character.isSpace(s.charAt(i))) {
				count++;
				
			}
			else {
				s2+=s.charAt(i);
				
			}
		}
		System.out.println(count);
		System.out.println(s2);
	} 
}

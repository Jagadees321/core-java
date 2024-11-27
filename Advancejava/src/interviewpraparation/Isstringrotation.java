package interviewpraparation;

public class Isstringrotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String s2="cdab";
		if(isstrrotation(s,s2)) {
			System.out.println("rotaion of str");
		}

	}
	public static boolean isstrrotation(String s1,String s2) {
		return s1.length()==s2.length() && (s1+s2).indexOf(s2)!=-1;
	}

}

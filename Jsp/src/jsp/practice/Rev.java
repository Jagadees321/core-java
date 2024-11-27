package jsp.practice;

//import java.util.Iterator;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jayas";
		String s2="";
		for(int i=s.length()-1;i>=0;i--) {
			s2+=s.charAt(i);

	}
		System.out.println(s2);
	}
}

package jsp.practice;

public class Madam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="madamd";
		if(palin(a)) {
			System.out.println("palindrome");
			
		}
		else {
			System.out.println("not");
		}
		

	}
	public static boolean palin(String s) {
		char[]c=s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j) {
			if(c[i]!=c[j]) return false ;
			i++;
			j--;
		}
		return true;
	}

}

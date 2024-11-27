package placement;

public class Strlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is not pure oop language";
		String[] a=s.split(" ");
		String s1="";
		
		for(String b:a) {
			s1+=b+b.length()+" ";
		}
		s1=s1.trim();
		
		//System.out.println(s1.hashCode());
		System.out.println(s1);

	}

}

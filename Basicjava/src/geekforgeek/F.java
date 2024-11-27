package geekforgeek;

public interface F {
  abstract void m();
}
class Bar {

	public static void main(String[] args) {
		String s=new String("J11");
		String s1="J11";
		String s2=s1.intern();
		System.out.println(s==s2);
	}
	
}
package jsp.practice;

public class Kk {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        m1(1);
        
        String s=null;
        System.out.println(s==null);
	}
	public static void m1(int i) {
		System.out.println(i);
		if(i<3) {
			m1(++i);
		}
	}

}

package stringbufferandbuilder;

public class Stringbuffermethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer b=new StringBuffer();
        StringBuilder a=new StringBuilder();
        
        b.append(0);
        System.out.println(b);
        b.append(4);
        System.out.println(b);
        a.append(0);
        System.out.println(a);
        a.append(4);
        System.out.println(a);
        
//        String a1="A";
//        
//        String a2="AB";
//        String a3="AB";
//        a1=a1+"B";
//        
//        System.out.println(a1==a2);
//        System.out.println(a2==a3);
	}

}

package strings;

public class Passwordextraction {

	public static void main(String[] args) {

        String s1="password is :Jaggu@123";
        String s2="Jaggu@123";
        String s3="";
        for(int i=0;i<s1.length();i++) {
        	char c=s1.charAt(i);
        	if(c==':') {
        		for(int j=i+1;j<s1.length();j++) {
        			char a=s1.charAt(j);
        			s3+=a;
        		}
        	}
        }
        System.out.println(s3);
        System.out.println(s2);
        System.out.println(s2.equals(s3));
        

	}

}

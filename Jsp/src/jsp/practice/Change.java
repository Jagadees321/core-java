package jsp.practice;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abcjkh123DEF*#@%";
		String temp="";
		int c=0;
		int n=0;
		int sp=0;
		int s=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch>='a' && ch<='z') {
				s++;
				temp+=(char)(ch-32);
			}
			else if(ch>='A' && ch<='Z') {
				c++;
				temp+=(char)(ch+32);
			}
			else if(ch>='0' && ch<='9'){
				n++;
				temp+=ch;
			}
			else {
				sp++;
				temp+=ch;
			}
		}
        System.out.println(temp);
        System.out.println("capital = "+c);
        System.out.println("numbers = "+n);
        System.out.println("special = "+sp);
        System.out.println("small = "+s);
		

	}

}

package jsp.practice;

public class Countoccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jagadeesh";
		char[]a=s.toCharArray();
		String s1="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int count=0;
			if(s1.indexOf(c)==-1) {
				for(int j=0;j<s.length();j++) {
				
					if(a[i]==a[j]) {
						count++;
						s1+=a[i];
					}
					
				}
				System.out.println("no of "+a[i]+" occurances = "+ count);
			}
		}
		

	}

}

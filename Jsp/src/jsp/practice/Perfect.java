package jsp.practice;

public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1h3993sj12";
		if(s1(s)) {
			System.out.println("perfect");
			
		}
		else {
			System.out.println("not perfect");
		}

	}
	public static boolean s1(String s) {
		char[]a=s.toCharArray();
		String sum = "";
		int s1 = 0;
		int s2=0;
		for(int i=0;i<s.length();i++) {
			if(a[i]>='0' && a[i]<='9') {
				sum+=""+a[i];	
			}
			
		}
		s1=Integer.parseInt(sum);
		while(s1>0) {
			int r=s1%10;
			s2+=r;
			s1=s1/10;
			
		}
		
		return isperfect(s2);
	}
	
	public static boolean isperfect(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
		
		return sum==n;
	}

}

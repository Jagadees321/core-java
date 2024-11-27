package placement;

public class Higherlenstringinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= {"java","abc","bnv","azcde","bbcde"};
		String s="";
		
		for(int i=0;i<a.length;i++) {
			if(s.length()<a[i].length() || s.length()==a[i].length()) {
				if(s.length()==a[i].length()) {
					if(s.hashCode()<a[i].length()) {
						s=s;
					}
					else {
						s=a[i];
					}
				}
				else {
					s=a[i];
				}
			}
			
		}
		System.out.println(s);

	}

}
